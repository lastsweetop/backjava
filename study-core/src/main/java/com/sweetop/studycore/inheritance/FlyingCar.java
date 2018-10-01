package com.sweetop.studycore.inheritance;


class  EncryptedKey {

}

interface OperateCar {
    // ...
    default public int startEngine(EncryptedKey key) {
        // Implementation
        return 1;
    }
}

interface FlyCar {
    // ...
    default public int startEngine(EncryptedKey key) {
        // Implementation
        return 2;
    }
}

public class FlyingCar implements OperateCar, FlyCar {
    // ...
    public int startEngine(EncryptedKey key) {
        return FlyCar.super.startEngine(key) + OperateCar.super.startEngine(key);
    }
}