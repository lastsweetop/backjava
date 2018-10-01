package com.sweetop.studycore.inheritance;


interface Mammal {
    String identifyMyself();
}

class AHorse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}

public class Mustang extends AHorse implements Mammal {
    public static void main(String... args) {
        Mustang myApp = new Mustang();
        System.out.println(myApp.identifyMyself());
    }
}