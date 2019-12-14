package com.git.test.basic;

public class TestLoad {
    public static void main(String[] args) {

        Student s1=new Student();
        s1.name="jay";
        s1.age=24;
        s1.show();

        Student s2=new Student();
        s2.name="jax";
        s2.age=22;
        s2.show();

    }
}


class Student {
    String name;
    int age;
    //静态的变量属于类，为所有对象公有
    static String address = "sz";

    public void show() {
        System.out.println(name + "--->" + age + "---->" + address);
    }

}