package com.kevin.test;

import com.kevin.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-19
 */
public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");

            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(list);
                    break;
                case "2":
                    System.out.println("删除学生");
                    deleteStudent(list);
                    break;
                case "3":
                    System.out.println("修改学生");
                    updateStudent(list);
                    break;
                case "4":
                    System.out.println("查看学生");
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("感谢您的使用");
                    return;
                default:
                    System.out.println("您的输入有误,请重新输入");
                    break;
            }
        }
    }

    //修改学生
    private static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要修改的学生学号");
        String updateSid = sc.next();
        int index = getIndex(list, updateSid);
        if (-1 == index) {
            System.out.println("查无信息,请重新输入");
        } else {
            System.out.println("请输入新的姓名:");
            String name = sc.next();
            System.out.println("请输入新的年龄:");
            int age = sc.nextInt();
            System.out.println("请输入新的生日:");
            String birthday = sc.next();
            Student stu = new Student(updateSid, name, age, birthday);
            list.set(index, stu);
            System.out.println("修改成功");
        }
    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要删除的学生学号");
        String deleteSid = sc.next();
        int index = getIndex(list, deleteSid);
        if (-1 == index) {
            System.out.println("查无信息,请重新输入");
        } else {
            list.remove(index);
            System.out.println("删除成功");

        }
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("无信息,请添加后重新查询");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getSid() + "\t\t" + stu.getName()
                    + "\t" + stu.getAge() + "\t" + stu.getBirthday());
        }
    }

    //获取学号在集合中对应的学生的索引
    public static int getIndex(ArrayList<Student> list, String sid) {
        //假设传入的学号,在集合中不存在
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            //判断集合中的每个学生学号,和传入的学号是否相同
            if (list.get(i).getSid().equals(sid)) {
                //如果相同,返回索引
                index = i;
            }
        }
        //如果未查找到相同学号返回 -1 (index值不变)
        return index;
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学号:");
            sid = sc.next();
            if (-1 == getIndex(list, sid)) {
                //如果getIndex返回-1表示 未找到此学号,跳出,添加
                break;
            } else {
                //否则,找到,重复,重新输入
                System.out.println("学号重复,请重新输入");
            }
        }
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        System.out.println("请输入生日:");
        String birthday = sc.next();
        //根据输入信息,创建学生对象
        Student student = new Student(sid, name, age, birthday);
        //添加学生对象到集合
        list.add(student);
        System.out.println("添加成功");
    }
}
