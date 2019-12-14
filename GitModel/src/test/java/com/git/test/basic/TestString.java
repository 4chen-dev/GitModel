package com.git.test.basic;

public class TestString {
    public static void main(String[] args) {
        //StringToString();
        //拼接字符串花了18毫秒
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(sb);
        System.out.println(end - start);
    }

    private static void StringToString() {
        //拼接字符串花了66921毫秒
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(str);
        System.out.println(end - start);
    }
}
