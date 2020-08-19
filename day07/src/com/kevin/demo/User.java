package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-17
 */

/**
 * 课堂练习：
 *     定义User类，包含属性：
 *         String类型的name、int类型的age、String类型的like
 *         提供空参/有参构造、get/set方法
 *         提供show方法, 打印该对象所有属性
 *     测试类：
 *         实例化3个User对象, 3个对象的属性分别为
 *         "夏诗韵",20,读书  "慕容雪痕",21,弹钢琴  "燕清舞",18,跳舞
 *         将3个对象分别添加到合适的数组中
 *         修改数组中, 年龄大于等于20岁的User对象的爱好为"敲代码"
 *         遍历修改后的数组, 调用show方法打印所有对象属性
 */
public class User {
    private String name;
    private int age;
    private String like;

    public User() {
    }

    public User(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
    public void show(){
        System.out.println("姓名:" + name + " 年龄:"
                + age + " 爱好:" + like );
    }
}
