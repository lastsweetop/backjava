package com.sweetop.studycore.moreclass;

public class BedAndBreakfast {

    // initialize to 10     
    public static int capacity = 10;

    // initialize to false
    private boolean full = false;

    static {
        // whatever code is needed for initialization goes here
        System.out.println("static initialization block");
    }

    {
        // whatever code is needed for initialization goes here
        System.out.println("initializing instance members");
    }

    

} 