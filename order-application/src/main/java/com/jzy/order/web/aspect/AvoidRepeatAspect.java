package com.jzy.order.web.aspect;

import com.alibaba.fastjson.JSON;
import com.jzy.order.exception.ServiceException;
import com.jzy.order.exception.ServiceExceptionEnum;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/**
 * @author jinziyu
 * @date 2020/4/20 21:19
 */
@Aspect
@Component
public class AvoidRepeatAspect {
    @Autowired
    private RedissonClient redissonClient;

    private static final String PRE = "order.jzy.com";

    @Pointcut("@annotation(com.jzy.order.web.aspect.AvoidRepeat)")
    public void avoidRepeatPoint() {
        // ignore
    }

    @Around("avoidRepeatPoint()")
    public Object aroundAdvice(ProceedingJoinPoint point) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) point.getSignature();
        Method method = methodSignature.getMethod();
        AvoidRepeat avoidRepeat = method.getAnnotation(AvoidRepeat.class);
        String redisKey = PRE + point.getSignature().getName() + JSON.toJSONString(point.getArgs()).hashCode();
        RLock rLock = redissonClient.getLock(redisKey);
        if (rLock.tryLock(0, avoidRepeat.intervalTime(), TimeUnit.SECONDS)) {
            try {
                return point.proceed();
            } finally {
                rLock.unlock();
            }
        } else {
            throw new ServiceException(ServiceExceptionEnum.REPEATED_REQUEST);
        }
    }

}
