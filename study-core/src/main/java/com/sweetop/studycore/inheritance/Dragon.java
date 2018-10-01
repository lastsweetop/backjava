package com.sweetop.studycore.inheritance;

interface Animal {
    default public String identifyMyself() {
        return "I am an animal.";
    }
}

interface EggLayer extends Animal {
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}

class FireBreather implements Animal {
}


public class Dragon extends FireBreather implements EggLayer {
    public static void main(String... args) {
        Dragon myApp = new Dragon();
        System.out.println(myApp.identifyMyself());
    }
}