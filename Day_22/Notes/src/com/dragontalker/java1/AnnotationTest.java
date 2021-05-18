package com.dragontalker.java1;

/**
 * 注解的使用
 *
 * 1. 理解Annotation
 *  - jdk5.0新增
 *  - Annotation就是代码中标记的特殊信息
 *  - 代替XML配置
 *
 * 2. Annotation的使用实例
 *  示例一: 生成文档时的注解
 *  示例二: @Override @Deprecated @SuppressWarnings
 */

public class AnnotationTest {
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
