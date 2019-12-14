package com.git.pojo;

import java.io.File;

public class FileDemo3 implements test {

    public static void main(String[] args) {
        File dir = new File("D:\\a");
        getAllFiles(dir);
    }

    public static void getAllFiles(File dir) {
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                //这里面用了递归的算法
                getAllFiles(files[i]);
            } else {
                System.out.println(files[i].getAbsolutePath());
            }
        }
    }
    //获取层级的方法
    public static String getLevel(int level) {
        //A mutable sequence of characters.
        StringBuilder sb = new StringBuilder();
        for (int l = 0; l < level; l++) {
            sb.append("|--");
        }
        return sb.toString();
    }

  /*  public static void getAllFiles(File dir) {
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                //这里面用了递归的算法
                getAllFiles(files[i]);
            } else {
                System.out.println(files[i].getAbsolutePath());
            }
        }
    }*/
}
