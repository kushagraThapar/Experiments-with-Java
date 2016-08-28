package com.krutarth;

/**
 * Created by kushagrathapar on 3/9/16.
 */
public class StringExperiment {
    public static void main(String[] args) {
        String s = "Hello, World";
        System.out.println(countLastWordLength(s));
        s = "Hello ,    world    ";
        System.out.println(countLastWordLength(s));
        s = "a";
        System.out.println(countLastWordLength(s));
    }

    public static int countLastWordLength(String s) {
        boolean nonWhiteSpaceCharFound = false;
        int startIndex = 0;
        int index = s.length();
        while(index > 0) {
            if(!nonWhiteSpaceCharFound && s.charAt(index - 1) != ' ') {
                nonWhiteSpaceCharFound = true;
                startIndex = index;
            } else if(nonWhiteSpaceCharFound && s.charAt(index - 1) == ' ') {
                return startIndex - index;
            }
            index--;
        }
        return startIndex;
    }
}
