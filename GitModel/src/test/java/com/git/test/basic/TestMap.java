package com.git.test.basic;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        //底层结构是哈希表：数组+链表
        Map<Person, String> map = new HashMap<>();
        //如何保证键的唯一性
        //调用添加方法put时，会调用person类中的hashCode方法获取键的哈希值，
        // 然后判断数组中是否已经存在该哈希值：
        //没有，直接存储
        //有，则调用equals比较内容值，判断内容是否相等。如果不同则挂在该链表下，如果相同则舍弃。
        Person person = new Person("jay", 12);
        Person person1 = new Person("jax", 23);
        Person person2 = new Person("jax", 23);
        Map<Character, Integer> map1 = new HashMap<>();
        String str = "abcddddeffffgh";
        //统计每个字符出现的次数
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                //根据索引获取对应索引的字符
                char c = str.charAt(i);
                if (!map1.containsKey(c)) {
                    map1.put(c, 1);
                } else {
                    map1.put(c, map1.get(c) + 1);
                }
            }
        }
        System.out.println(map1);

    }
}

class Person {
    private String username;
    private Integer age;

    public Person(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public Person() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(username, person.username) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}