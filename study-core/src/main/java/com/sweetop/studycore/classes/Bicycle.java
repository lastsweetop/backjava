package com.sweetop.studycore.classes;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/9
 * Time: 下午10:37
 * To change this template use File | Settings | File Templates.
 */
public class Bicycle {
    // the Bicycle class has
    // three fields
    private int cadence;
    private int gear;
    private int speed;

    private int id;
    private static int numberOfBicycle = 0;


    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
        id = ++numberOfBicycle;
    }

    public static int getNumberOfBicycle() {
        return numberOfBicycle;
    }

    public int getId() {
        return id;
    }

    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public int getCadence() {
        return cadence;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public Bicycle newBike() {
        return new Bicycle(1, 1, 1);
    }
}
