package com.sweetop.studyspring.ioc;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/25
 * Time: 下午9:43
 * To change this template use File | Settings | File Templates.
 */
@Service("timeHandler")
@Aspect
@Order(1)
public class TimeHandler {

    @Pointcut("execution(* com.sweetop.studyspring.ioc.*.*(..))")
    public void pointcutName() {
    }

    @Before("pointcutName() && args(name)")
    public void printTime(String name) {
        System.out.println("Before CurrentTime = " + System.currentTimeMillis()+",args name="+name);
    }


    @After("pointcutName()")
    public void printTime2() {
        System.out.println("After CurrentTime = " + System.currentTimeMillis());
    }

    @Around("pointcutName()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("进入方法"+pjp);
        Object object=pjp.proceed(pjp.getArgs());
        System.out.println("退出方法");
        return object;
    }
}
