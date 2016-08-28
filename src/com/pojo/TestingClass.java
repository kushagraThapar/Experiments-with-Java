package com.pojo;

/**
 * Created by kushagrathapar on 1/25/16.
 */
public class TestingClass {

    private String name;
    private int age;

    public TestingClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public TestingClass() {}

    public void publicMethod() {
        System.out.println("Public method... Printing class details: ");
        System.out.println("Name [" + name + "]");
        System.out.println("Age [" + age + "]");
    }

    private void privateMethod() {
        System.out.println("Private method... Printing class details: ");
        System.out.println("Name [" + name + "]");
        System.out.println("Age [" + age + "]");
    }

}
