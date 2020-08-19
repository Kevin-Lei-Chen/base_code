package com.kevin.test;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-16
 */
public class Dog {
    private String color;
    private String breed;

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat(){
        System.out.println(this.color + "的" + breed + "正在啃骨头...");
    }
    public void lookHome(){
        System.out.println(this.color + "的" + breed + "正在看家...");
    }
}
