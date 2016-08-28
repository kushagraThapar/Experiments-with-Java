package com.dhawal;

import com.pojo.ParentClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kushagrathapar on 5/2/16 at 10:33 PM.
 */
public class PrintTestingClass {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);

        List<ParentClass> parentClassList = new ArrayList<>();
        parentClassList.add(new ParentClass(10));
        parentClassList.add(new ParentClass(12));
        parentClassList.add(new ParentClass(14));
        parentClassList.add(new ParentClass(16));
        System.out.println(parentClassList);
    }
}
