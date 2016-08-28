package com.dhawal;

/**
 * Created by kushagrathapar on 2/29/16.
 */
public class RecursionExperiment {
    public static void main(String[] args) {
        recursionFunction("1234", 0, 0);
    }

    public static void recursionFunction(String s, int partition, int startPosition) {
        int i = 0;
        while (i < s.length()) {
            if(partition != 0 && i == startPosition - 1) {
                int j = 0;
                while (j++ < partition) {
                    System.out.print(s.charAt(i));
                    i++;
                }
            }
            System.out.println(s.charAt(i));
            i++;
        }
        if(partition == 0) {
            partition++;
        }
        if(startPosition == s.length() - 1) {
            return;
        }
        startPosition++;
        recursionFunction(s, partition, startPosition);
    }
}
