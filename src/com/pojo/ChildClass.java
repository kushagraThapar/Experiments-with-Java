package com.pojo;

/**
 * Created by kushagrathapar on 10/26/15.
 */
public class ChildClass extends ParentClass{

    protected int age;

    /**
     * Either super() must be the first statement or this() must be the first statement.
     * Both cannot work simultaneously.
     */
    public ChildClass() {
        this(10);
        //  super();
        System.out.println("Child Class Constructor");
        System.out.println("This is num : " + num);
        //this(10);     //returns compile time error that this must be the first statement of the constructor.
    }

    public ChildClass(int age) {
        super();
        this.age = age;
        System.out.println("Child Class Constructor with arguments");
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public void childClassMethod() {
        System.out.println("Child Class method");
    }
}
