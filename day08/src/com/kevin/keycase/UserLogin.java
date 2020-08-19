package com.kevin.keycase;

import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-18
 */
public class UserLogin {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入用户名:");
            String scUsername = sc.nextLine();
            System.out.println("请输入密码:");
            String scPassword = sc.nextLine();
            if(username.equals(scUsername) && password.equals(scPassword)){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("用户名或密码错误");
                if(i == 3){
                    System.out.println("你已达到今天登录上限");
                }else{
                    System.out.println("你还有" + (3 - i) + "次机会");
                }
            }
        }


    }
}
