package com.git.test.basic;

public class TestClass {
    private String FName;
    private static String FPassword;

    //静态内部类
    static class staticClass {
       //定义非静态
        private String name;
        //定义静态变量
        private static String password;
        //定义静态方法
        public static void staticMethod() {
            //只能内部类静态成员
            System.out.println(password);
            System.out.println(FPassword);
        }
        //定义非静态方法
        public void InstanceMethod(){
            //可以访问内部类的静态和非静态成员
            System.out.println(name+"----"+password);
            //只能访问外部类的静态成员
            System.out.println(FPassword);
        }

    }

    //非静态内部类
    class InstanceClass {
        private String name;
        //不能定义静态变量
        //private static String password;
        //只能声明非静态方法
        public void InstanceMethod(){
            System.out.println(name);
            //访问外部类的静态和非静态
            System.out.println(FName+FPassword);
        }
    }
}
