package com.jzy.order.config.db;

import org.jooq.DSLContext;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import java.util.Objects;

/**
 * @author jinziyu
 * @date 2020/4/19 17:57
 */
@Component
public class JooqDaoScannerConfiguration implements BeanDefinitionRegistryPostProcessor, BeanPostProcessor, BeanFactoryAware {
    private BeanFactory beanFactory;

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry, false);
        scanner.setBeanNameGenerator((definition, beanDefinitionRegistry) -> "jooq" +
                ClassUtils.getShortName(Objects.requireNonNull(definition.getBeanClassName())));
        scanner.addIncludeFilter((metadataReader, metadataReaderFactory) -> "org.jooq.impl.DAOImpl".equals(
                metadataReader.getClassMetadata().getSuperClassName()));
        scanner.scan("com.jzy.order.db");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // ignore
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof DAOImpl) {
            DSLContext dslContext = beanFactory.getBean(DSLContext.class);
            ((DAOImpl) bean).setConfiguration(dslContext.configuration());
        }
        return bean;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
