package com.sweetop.studycore.oo;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/4
 * Time: 下午2:58
 * To change this template use File | Settings | File Templates.
 */
public interface Bicycle {
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
