package com.string;

/**
 * Created by kushagrathapar on 8/28/16 at 5:44 PM.
 */
public class StringExperiments {

    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2);
        s1.intern();
    }
}
