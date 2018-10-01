package com.sweetop.studycore.annotations;

public class MyHouse implements House {

    @SuppressWarnings("deprecation")
    public void open() {
    }

    public void openFrontDoor() {
    }

    public void openBackDoor() {
    }

    @Meal(value = "breakfast", mainDish = "cereal")
    @Meal(value = "lunch", mainDish = "pizza")
    @Meal(value = "dinner", mainDish = "salad")
    public void evaluateDiet() {

    }

    public static void main(String[] args) {
        new MyHouse().evaluateDiet();
    }
}