package com.jzy.order.config.db;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.jzy.order.domain.DataSourceSwitcher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jinziyu
 * @date 2020/4/19 23:32
 */
@Configuration
@EnableTransactionManagement
public class DBConfig {
    @Bean(name = "dataSourceMaster")
    @ConfigurationProperties(prefix = "spring.datasource.druid.master")
    public DataSource dataSourceMaster() {
        return DruidDataSourceBuilder.create().build();
    }

    @Primary
    @Bean
    public DynamicDataSource dataSource(@Qualifier("dataSourceMaster") DataSource dataSourceMaster) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DataSourceSwitcher.MASTER, dataSourceMaster);
        DynamicDataSource dataSource = new DynamicDataSource();
        dataSource.setTargetDataSources(targetDataSources);
        dataSource.setDefaultTargetDataSource(dataSourceMaster);
        return dataSource;
    }

    @Primary
    @Bean
    public PlatformTransactionManager txManager(@Qualifier("dataSource") DynamicDataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
