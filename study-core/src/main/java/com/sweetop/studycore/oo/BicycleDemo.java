package com.sweetop.studycore.oo;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/4
 * Time: 上午11:40
 * To change this template use File | Settings | File Templates.
 */
public class BicycleDemo {
    public static void main(String[] args) {
        // Create two different
        // ACMEBicycle objects
        ACMEBicycle bike1 = new MountainBike();
        ACMEBicycle bike2 = new MountainBike();

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
