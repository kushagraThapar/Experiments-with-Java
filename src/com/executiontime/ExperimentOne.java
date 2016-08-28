package com.executiontime;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kushagrathapar on 1/22/16.
 */
public class ExperimentOne {

    public static final long MEGABYTE = 1024L * 1024L;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String input = "MMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIXMMMMMMMMMMMMMMMMMMMMMMMMCMXCIX";
        final Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        System.out.println(conversion(input, map));

        long endTime = System.currentTimeMillis();
        System.out.println("Total time in execution is [" + (endTime - startTime) + "]");

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory in bytes [" + memory + "]");
        System.out.println("Used memory in mega bytes [" + bytesToMegabytes(memory) + "]");
    }

    public static double bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }


    public static long conversion(String input, Map<Character, Integer> map) {
        long total = 0;

        long a = map.get(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            long b = map.get(input.charAt(i));
            if (a >= b) {
                total += a;
            } else {
                total -= a;
            }
            a = b;
        }
        total += map.get(input.charAt(input.length() - 1));
        return total;
    }
}
