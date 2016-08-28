package com.executiontime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kushagrathapar on 1/22/16.
 */
public class ExperimentTwo {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String input = "MMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIX";
        try {
            System.out.println(conversion(input));
        } catch (Exception e) {
            System.out.println("ERROR [" + e.getMessage() + "]");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time in execution is [" + (endTime - startTime) + "]");
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory in bytes [" + memory + "]");
    }

    public static long conversion(String input) throws Exception {
        long total = 0;
        long a = getIntegerNumber(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            long b = getIntegerNumber(input.charAt(i));
            if (a >= b) {
                total += a;
            } else {
                total -= a;
            }
            a = b;
        }

        total += getIntegerNumber(input.charAt(input.length() - 1));
        return total;
    }

    public static int getIntegerNumber(char c) throws Exception {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new Exception("Invalid Character found {" + c + "}");
        }
    }
}
