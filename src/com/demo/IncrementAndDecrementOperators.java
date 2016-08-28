package com.demo;

/**
 * Created by kushagrathapar on 3/5/16.
 */
public class IncrementAndDecrementOperators {

    public static void main(String[] args) {
        int i = 11, j = 10;
        i = i++ > 10 ? i++ : --i;
        i = ++i;
        System.out.println(i);
        swap(i, ++i);
    }

    public static void swap(int i, int j) {
        System.out.println("i [" + i + "]");
        System.out.println("j [" + j + "]");
    }
}
