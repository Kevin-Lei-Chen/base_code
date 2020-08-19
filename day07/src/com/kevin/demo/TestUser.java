package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-17
 */
public class TestUser {
    public static void main(String[] args) {
        //"夏诗韵",20,读书  "慕容雪痕",21,弹钢琴  "燕清舞",18,跳舞
        User user1 = new User("夏诗韵",20,"读书");
        User user2 = new User("慕容雪痕",21,"弹钢琴");
        User user3 = new User("燕清舞",18,"跳舞");
        User[] users = {user1, user2, user3};
        for (int i = 0; i < users.length; i++) {
            if(users[i].getAge() >= 20){
                users[i].setLike("敲代码");
            }
            users[i].show();
        }

    }
}
