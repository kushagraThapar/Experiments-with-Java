package com.binary;

/**
 * Created by kushagrathapar on 1/21/16.
 */
public class MainExperimentClass {

    public static void main(String[] args) {
        int n = 10;
        printValue(10);
    }

    public static void printValue(int n) {
        StringBuilder binaryForm = new StringBuilder();
        int digit;
        while(n >= 2) {
            digit = n % 2;
            binaryForm.append(digit);
            n = n/2;
        }
        binaryForm.append(n);
        System.out.println(binaryForm.reverse());
    }
}
