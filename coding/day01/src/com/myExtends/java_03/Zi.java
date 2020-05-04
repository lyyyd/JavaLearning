package com.myExtends.java_03;

/**
 * @ClassName Zi
 * @Description TODO
 * @Author David.Jackson.Lyd@gmail.com
 * @Date: 2020/05/04 15:51
 */
public class Zi extends Fu{
    public void show() {
        int age = 30;
        System.out.println(age);
        //我要访问本类的成员变量age，怎么办呢？
        System.out.println(this.age);
        //我要访问父类的成员变量age，怎么办呢？
        System.out.println(super.age);
    }
}
