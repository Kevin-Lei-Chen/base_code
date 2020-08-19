package com.kevin.keycase;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-16
 */
public class Student {
    /**
     * 学生的名字
     */
    private String name;
    /**
     * 学生的年龄
     */
    private int age;

    //空参构造器,在存在有参构造器时,需要手动添加
    public Student(){}
    //有参构造器
    public Student(String name, int age){
        //为属性赋值,this代表当前对象
        this.name = name;
        this.age = age;
    }
    //设置name属性的get方法
    public String getName() {
        return name;
    }
    //设置name属性的set方法
    public void setName(String name) {
        this.name = name;
    }
    //设置age属性的get方法
    public int getAge() {
        return age;
    }
    //设置age属性的set方法
    public void setAge(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println(name + "..." + age);
    }
}
