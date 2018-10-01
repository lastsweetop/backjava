package com.sweetop.studycore.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedDelay = 1500)
    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }

    public static void main(String[] args) {
        Method[] methods = ScheduledTasks.class.getDeclaredMethods();
        for (Method method : methods) {
            Scheduled[] scheduleds = method.getAnnotationsByType(Scheduled.class);
            for (Scheduled scheduled : scheduleds) {
                System.out.println(scheduled);
            }
        }
    }
}