package com.sweetop.studycore.annotations;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Meals.class)
public @interface Meal {
    String value();

    String mainDish();
}

