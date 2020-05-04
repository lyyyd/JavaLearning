package com.myExtends.java_06;

/**
 * @ClassName PhoneDemo
 * @Description TODO
 * @Author David.Jackson.Lyd@gmail.com
 * @Date: 2020/05/04 16:05
 */
public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Phone p = new Phone();
        p.call("林青霞");
        System.out.println("--------");

        NewPhone np = new NewPhone();
        np.call("林青霞");
    }
}
