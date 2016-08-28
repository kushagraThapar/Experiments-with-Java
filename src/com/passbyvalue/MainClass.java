package com.passbyvalue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kushagrathapar on 1/20/16.
 */
public class MainClass {

    public static void main(String[] args) {

        PassByValueExperiment newExperiment = new PassByValueExperiment(5);

        /*PassByValueExperiment newExperiment1 = new PassByValueExperiment(5);

        System.out.println(newExperiment.counter); //  5

        UtilityClass.modifyObject(newExperiment);

        System.out.println(newExperiment.counter);  //  10

        System.out.println(newExperiment1.counter); //  5

        System.out.println(PassByValueExperiment.staticCounter);*/

        System.out.println(String.valueOf(newExperiment));

        int a = 10;

        Integer b = 20;

        System.out.println(a);
        System.out.println(b);


        List<String> abcd = new ArrayList<>();
    }

    static {
        System.out.println("Main Class method called");
    }
}
