package com.kevin.test;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-16
 */
public class Test01 {
    public static void main(String[] args) {
        Cat cat = new Cat("花色", "波斯猫");
        Dog dog = new Dog();
        dog.setColor("黑色");
        dog.setBreed("藏獒");

        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.lookHome();

    }
}
