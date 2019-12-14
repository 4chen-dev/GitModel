package com.git.test;

/**
 * 定义枚举类，包含了所有类型
 */
public enum EnumTest {

    A("one") {
        @Override
        public void apply() {
            System.out.println("one");
        }
    },
    B("two") {
        @Override
        public void apply() {
            System.out.println("two");
        }
    }, C("three") {
        @Override
        public void apply() {
            System.out.println("three");
        }
    }, D("four") {
        @Override
        public void apply() {
            System.out.println("four");
        }
    };

    public abstract void apply();

    private String type;

    EnumTest(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }



}