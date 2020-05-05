package com.myInterface.java_02;

public interface Inter {
    void show();

    default void method(){
        System.out.println("Inter 中的默认方法method执行了");
    }

//    public static void test(){
//        System.out.println("Inter 中的静态方法执行了");
//    }

    static void test(){
        System.out.println("Inter 中的静态方test法执行了");
    }
}
