package com.sweetop.studyspring.ioc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/8/25
 * Time: 下午7:40
 * To change this template use File | Settings | File Templates.
 */
@Service("helloIoc")
public class HelloIoc {
    public void sayHello(String name) {
        System.out.println("hello ioc "+name);
    }
}
