package com.complex;

/**
 * Created by kushagrathapar on 9/12/16 at 8:21 PM.
 */
public class ComplexityClass {

    public static void main(String[] args) {
        int count = 0;
        for(int i = 100; i > 0; i /= 2) {
            count++;
        }
        System.out.println(count);
    }
}
