package com.sweetop.studycore.annotations;

public interface House {

    @Deprecated
    void open();

    void openFrontDoor();

    void openBackDoor();
}