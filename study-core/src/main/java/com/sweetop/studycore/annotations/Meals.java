package com.sweetop.studycore.annotations;

import java.lang.annotation.*;

/**
 * User: lastsweetop
 * Date: 2018/9/27
 * Time: 下午3:58
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Meals {
    Meal[] value();
}
