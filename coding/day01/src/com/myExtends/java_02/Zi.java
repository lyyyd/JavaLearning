package com.myExtends.java_02;

/**
 * @ClassName Zi
 * @Description TODO
 * @Author David.Jackson.Lyd@gmail.com
 * @Date: 2020/05/04 15:45
 */
public class Zi extends Fu {
    //身高
    public int height = 175;

    //年龄
    public int age = 20;

    public void show() {
        int age = 30;
        System.out.println(age);
        System.out.println(height);
        //报错
//        System.out.println(weight);
    }
}