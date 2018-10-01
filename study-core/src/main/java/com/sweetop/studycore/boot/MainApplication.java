package com.sweetop.studycore.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.lang.annotation.ElementType;
import java.lang.reflect.AnnotatedElement;

/**
 * User: lastsweetop
 * Date: 2018/9/27
 * Time: 上午11:14
 */
@SpringBootApplication
@EnableScheduling
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
