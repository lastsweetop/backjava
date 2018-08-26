package com.sweetop.studyspring.ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/25
 * Time: 下午8:33
 * To change this template use File | Settings | File Templates.
 */

@Lazy(true)
//@Scope("singleton")
@Service("SpringLifeCycle")
public class SpringLifeCycle  {
    public SpringLifeCycle() {
        System.out.println("SpringLifeCycle");
    }

    //定义销毁方法
    @PreDestroy
    public void destroy() {
        System.out.println("destroy...");
    }

    public void sayHello() {
        System.out.println("say Hello...");
    }

    @PostConstruct
    public void init() {
        System.out.println("init...");
    }
}
