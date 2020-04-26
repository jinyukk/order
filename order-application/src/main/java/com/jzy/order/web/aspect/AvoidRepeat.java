package com.jzy.order.web.aspect;

import java.lang.annotation.*;

/**
 * @author jinziyu
 * @date 2020/4/20 21:16
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AvoidRepeat {
    /**
     * 重复提交最小间隔
     * @return
     */
    int intervalTime() default 1;
}
