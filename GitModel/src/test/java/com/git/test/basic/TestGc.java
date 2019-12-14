package com.git.test.basic;

public class TestGc {
    public static void main(String[] args) {
        //当创建的垃圾对象足够多时，垃圾回收器才会执行
        for (int i = 0; i < 100; i++) {
            //匿名对象没有被引用，创建后就成为垃圾对象
            new Demo();
            //通知垃圾回收器回收垃圾
            System.gc();
        }
    }
}

class Demo{
    //如果校验垃圾被回收了？
    //只要重写object的finalize方法即可，当垃圾回收器清理垃圾时，会自动调用这个方法
    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾被清理了。。。。");
    }
}
