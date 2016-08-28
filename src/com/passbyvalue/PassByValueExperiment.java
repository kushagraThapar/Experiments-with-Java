package com.passbyvalue;

/**
 * Created by kushagrathapar on 1/20/16.
 */
public class PassByValueExperiment {
    public int counter = 1;
    public static int staticCounter = 10;

    public PassByValueExperiment() {}

    public PassByValueExperiment(int counter) {
        this.counter = counter;
    }

    public int nextValue() {
        counter++;
        staticCounter++;
        return counter;
    }

    static {
        System.out.println("Class loaded");
    }

    @Override
    public String toString() {
        return String.valueOf(counter);
    }
}
