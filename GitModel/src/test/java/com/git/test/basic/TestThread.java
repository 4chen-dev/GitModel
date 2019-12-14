package com.git.test.basic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class TestThread {
    public static void main(String[] args) throws Exception {
        //线程1
        //new MyThread().start();
        //线程2
        //new MyThread().start();


        //创建子线程，并共享thread2实现类的资源
        //new Thread(thread2,"线程1").start();
        //new Thread(thread2,"线程2").start();
        //创建实现类的对象
        //MyThread3 thread3 = new MyThread3();
        //使用FutureTask包装线程实现类
        //FutureTask<String> futureTask = new FutureTask<>(thread3);
        //使用thread包装FutureTask，并开启线程
        //new Thread(futureTask,"线程1").start();
        //获取任务的返回值
        //String result = futureTask.get();
        //System.out.println(result);

        //创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //创建实现类对象，实现类了runnable接口
        MyThread2 thread2 = new MyThread2();
        //将线程添加到线程池
        pool.submit(thread2);
        pool.submit(thread2);
        //关闭线程池
        pool.shutdown();

    }
}


//创建thread实现callable<object>
class MyThread3 implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
        return "callable Return";
    }
}

//创建thread实现类
class MyThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}


//创建自定义类继承thread
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}