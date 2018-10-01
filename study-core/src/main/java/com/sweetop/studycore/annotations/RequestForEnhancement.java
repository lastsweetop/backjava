package com.sweetop.studycore.annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface RequestForEnhancement {
    int id();

    String synopsis();

    String engineer() default "[unassigned]";

    String date() default "[unknown]";
}