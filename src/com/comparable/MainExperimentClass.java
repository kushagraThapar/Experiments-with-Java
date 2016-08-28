package com.comparable;

import com.pojo.StudentClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kushagrathapar on 2/8/16.
 */
public class MainExperimentClass {

    public static void main(String[] args) {
        List<Integer> hello = new ArrayList<>();
        hello.add(10);
        hello.add(40);
        hello.add(0);
        hello.add(5);

        System.out.println(hello);

        Collections.sort(hello);

        System.out.println(hello);


        List<StudentClass> newList = new ArrayList<>();
        newList.add(new StudentClass("Krutarth", 10));
        newList.add(new StudentClass("Kushagra", 20));
        newList.add(new StudentClass("Ashwin", 30));
        System.out.println(newList);
        Collections.sort(newList);
        System.out.println(newList);
    }
}
