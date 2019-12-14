package com.git.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {

        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("jay");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ("jay".equals(s)) {
                list.remove(s);
            }
        }

        Map<String, Object> map = new HashMap<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        String[] arr = {"12", "12", "33", "9"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()==1) {
                System.out.println(arr[i]);
            }
        }

    }
}
