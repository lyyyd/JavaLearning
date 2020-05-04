package com.myExtends.java_04;

/**
 * @ClassName Zi
 * @Description TODO
 * @Author David.Jackson.Lyd@gmail.com
 * @Date: 2020/05/04 15:55
 */
public class Zi extends Fu{
    public Zi() {
//        super();
//        super(20);
        System.out.println("Zi中无参构造方法被调用");
    }

    public Zi(int age) {
        super();
//        super(20);
        System.out.println("Zi中带参构造方法被调用");
    }
}
