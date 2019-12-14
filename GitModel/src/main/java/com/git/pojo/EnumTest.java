package com.git.pojo;

/**
 * 定义枚举类，包含了所有类型
 */
public enum EnumTest {


    ONE("one") {
        @Override
        public void apply() {
            System.out.println("one");
        }
    },
    TWO("two") {
        @Override
        public void apply() {
            System.out.println("two");
        }
    }, THREE("three") {
        @Override
        public void apply() {
            System.out.println("three");
        }
    }, FOUR("four") {
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
