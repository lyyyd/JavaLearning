package com.myExtends.java_06;

/**
 * @ClassName NewPhone
 * @Description TODO
 * @Author David.Jackson.Lyd@gmail.com
 * @Date: 2020/05/04 16:05
 */
public class NewPhone extends Phone{
    /*public void call(String name) {
        System.out.println("开启视频功能");
//        System.out.println("给" + name + "打电话");
        super.call(name);
    }*/

    @Override
    public void call(String name) {
        System.out.println("开启视频功能");
//        System.out.println("给" + name + "打电话");
        super.call(name);
    }
}
