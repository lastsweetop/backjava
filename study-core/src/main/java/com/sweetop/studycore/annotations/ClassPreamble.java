package com.sweetop.studycore.annotations;

import java.lang.annotation.Documented;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/26
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
@Documented
public @interface ClassPreamble {
    String author();

    String date();
    
    int currentRevision() default 1;

    String lastModified() default "N/A";

    String lastModifiedBy() default "N/A";

    // Note use of array
    String[] reviewers();
}
