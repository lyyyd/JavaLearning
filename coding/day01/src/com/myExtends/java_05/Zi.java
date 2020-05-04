package com.myExtends.java_05;

/**
 * @ClassName Zi
 * @Description TODO
 * @Author David.Jackson.Lyd@gmail.com
 * @Date: 2020/05/04 16:01
 */
public class Zi extends Fu {

    public void method() {
        System.out.println("Zi中method()方法被调用");
    }

    public void show() {
        super.show();
        System.out.println("Zi中show()方法被调用");
    }
}
