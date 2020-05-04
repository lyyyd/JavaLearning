package com.myInterface.java_02;
/*
    测试类
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        i.num = 10;
        System.out.println(i.num);
//        i.num2 = 40;
        System.out.println(i.num2);
        System.out.println(Inter.num);
//        i.num3 = 40;
        System.out.println(Inter.num3);
    }
}
