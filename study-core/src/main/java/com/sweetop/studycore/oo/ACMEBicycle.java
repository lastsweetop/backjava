package com.sweetop.studycore.oo;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/4
 * Time: 上午11:39
 * To change this template use File | Settings | File Templates.
 */
public class ACMEBicycle implements Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;


    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
