package com.git.test;

import com.git.pojo.EnumTest;
import org.junit.Test;

import java.lang.annotation.Annotation;

public class TestGit {
    // 枚举测试
    @Test
    public void testEnum() {
        com.git.pojo.EnumTest.valueOf("one".toUpperCase()).apply();

    }
}
