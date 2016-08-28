package com.reflection;

import com.pojo.TestingClass;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by kushagrathapar on 1/25/16.
 */
public class MainExperimentClass {

    public static void main(String[] args) {
        TestingClass testingClass1 = new TestingClass("Kushagra", 25);
        TestingClass testingClass2 = new TestingClass("Krutarth", 22);
        TestingClass testingClass3 = new TestingClass("Dhawal", 21);

        testingClass1.publicMethod();
        testingClass2.publicMethod();
        testingClass3.publicMethod();



        System.out.println("\n\n\n\n\n\n\n");
        try {
            Class<?> testingClass = Class.forName("com.pojo.TestingClass");
            Object obj = testingClass.newInstance();
            Field[] fields = testingClass.getDeclaredFields();
            Method[] methods = testingClass.getDeclaredMethods();
            System.out.println("Methods of this class [" + testingClass.getName() + "] are : ");
            for(Method method : methods) {
                System.out.println("Executing Method with Name [" + method.getName() + "]");
                method.setAccessible(true);
                method.invoke(obj);
            }
        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
