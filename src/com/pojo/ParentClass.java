package com.pojo;

/**
 * Created by kushagrathapar on 10/26/15.
 */
public class ParentClass {
    protected int num;


    public static ParentClass createInstance(int num) {
        ParentClass class1 = new ParentClass();
        class1.num = num;
        return class1;
    }

    public ParentClass(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    public ParentClass() {
        System.out.println("*****Parent Class Constructor*****");
    }

    public void parentClassMethod() {
        System.out.println("Parent Class method");
    }

    public static void main(String[] args) {
        ParentClass parentClass = new ChildClass();
        //  This is a compile time error, as ParentClass is unaware about the new methods in the Child Class.
        //parentClass.childClassMethod();
    }
}
