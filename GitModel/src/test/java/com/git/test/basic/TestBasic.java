package com.git.test.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;

public class TestBasic {
    public static void main(String[] args) {
        //map集合的四种遍历方式
        Map<String, String> map = new HashMap<>();
        map.put("username", "jay");
        map.put("password", "123");
        map.put("nickname", "steven");
        //第一种遍历方式，使用KeySet获取key的集合
        for (String key : map.keySet()) {
            //根据key获取map的value值
            String value = map.get(key);
            System.out.println(key + "---->" + value);
        }
        System.out.println("=====================");
        //第二种遍历方式，使用entrySet获取键值对对象，使用增强for遍历
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("=====================");
        //第三种方式，使用entrySet获取键值对对象，使用迭代器遍历
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("=====================");
        //使用values获取map的value集合
        for (String value : map.values()) {
            System.out.println(value);
        }
        print();
        //统计质数
        int count = find(10);
        System.out.println(count);

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        checkString(sb1, sb2);
        System.out.println(sb1);
        System.out.println(sb2);

        System.out.println(f(10));
    }

    public static void print() {
        String s1 = "Program" + "ming";
        String s2 = s1;
        String s3 = new String("Programming");
        System.out.println(s1 == s2);///true
        System.out.println(s1 == s3);//false
        System.out.println(s2 == s3);//false
        System.out.println(s2.equals(s3));//true

    }

    private static int find(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            boolean flag = true;
            if (i == 1 || i == 2) {
                continue;
            }
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }

    public static void checkString(StringBuilder sb1, StringBuilder sb2) {
        sb1.append(" other");
        sb2 = sb1;
    }

    private  static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return n+f(n-1);

    }

}
