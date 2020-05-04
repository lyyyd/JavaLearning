package com.myDuotai.java_06;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a = new Cat();
        System.out.println("10: " + a.getAge());
        a.setName("加菲");
        a.setAge(5);
        System.out.println("5: " + a.getAge());
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

    }
}
