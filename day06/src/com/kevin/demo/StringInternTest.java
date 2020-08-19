package com.kevin.demo;

/**
 * @author Kevin-Lei-Chen
 * @create 2020-08-15
 * 测试结果:
 * 1.new Sting("")创建的可能是1个对象也可能是2个对象
 * 2.intern()方法的返回值是常量池中此字符串的引用(地址)
 * 解释:
 * 1.创建1个对象: 是在常量池中有此对象,只需要在堆中创建一个对象并返回
 *  创建2个对象:是在常量池中没有此字符串,需要在常量池中创建此对象,并
 *              在堆中创建此对象,并返回
 * 2.该方法是先判断常量池中是否有此对象,如果没有先创建并返回其引用,如果
 * 有直接返回其引用,所以它返回的是常量池中字符串的地址(字符串对象的引用)
 */
public class StringInternTest {
    public static void main(String[] args) {
        String s=new String("1");
        //结果为false 他只是在常量池里创建了字符串"1"返回的地址没有接受
        s.intern();
        //结果为true intern方法返回的是常量池里字符串"1"的地址
        s = s.intern();
        String s2="1";
        System.out.println(s==s2);

        String s4="11";
        String s3=new String("1")+new String("1");
        s3 = s3.intern();
        String s5 = new String("11");
        System.out.println(s3==s4);
        System.out.println(s3==s5);
        s5 = s5.intern();
        System.out.println(s3==s5);

    }
}
