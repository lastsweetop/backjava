package com.sweetop.studycore.classes;

/**
 * Created with IntelliJ IDEA.
 * User: lastsweetop
 * Date: 2018/9/10
 * Time: 上午11:10
 * To change this template use File | Settings | File Templates.
 */
public class PassingReference {
    public static void moveCircle(Circle circle, int deltaX, int deltaY) {
        // code to move origin of circle to x+deltaX, y+deltaY
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);

        // code to assign a new reference to circle
        circle = new Circle(0, 0);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3, 4);
        moveCircle(circle, 23, 45);
        System.out.println(circle.getX()+":"+circle.getY());
    }
}
