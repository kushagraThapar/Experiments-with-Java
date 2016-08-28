package com.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kushagrathapar on 11/19/15.
 */
public class AnotherChildClass extends ChildClass {
    public static void main(String[] args) {
        AnotherChildClass anotherChildClass = new AnotherChildClass();
        anotherChildClass.num = 10;
        anotherChildClass.age = 10;

        ParentClass obj = new ChildClass();
        obj.parentClassMethod();

        ChildClass obj1 = (ChildClass) new ParentClass();
        obj1.childClassMethod();

        newMethod(obj);
    }


    public void solveThisProblem(ArrayList<String> list) {

    }

    public static void newMethod(ParentClass obj) {

    }
}
