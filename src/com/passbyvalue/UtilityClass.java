package com.passbyvalue;

/**
 * Created by kushagrathapar on 1/20/16.
 */
public class UtilityClass {

    public static void modifyObject(PassByValueExperiment experiment) {
        for(int i = 0; i < 5; i++) {
            experiment.nextValue();
        }
        System.out.println(experiment.counter); // 10
    }
}
