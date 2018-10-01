package com.sweetop.studycore.nestedclass;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/21
 * Time: 下午2:54
 * To change this template use File | Settings | File Templates.
 */
public class OverloadLambda {

    interface Runable {
        void run();
    }

    interface Runable2 {
        String run();
    }


    void methodA(Runable runable) {
        runable.run();
    }

    String methodA(Runable2 runable2) {
        return runable2.run();
    }


    public static void main(String[] args) {
        OverloadLambda overloadLambda = new OverloadLambda();

        overloadLambda.methodA(() -> System.out.println("methodA"));

        System.out.println(overloadLambda.methodA(() -> "methodA return string"));
    }
}
