package com.experiment;

import java.util.*;

/**
 * Created by kushagrathapar on 9/26/15.
 */
public class ExperimentsClass {
    public static void main(String[] args) {
        /*int a = 11;
        System.out.println("Odd number [" + a + "]");
        findFactors(a);
        System.out.println("Inline calculation ->" + (11 - 11 / 2) * (11 / 2));
        a = 10;
        System.out.println("Even number [" + a + "]");
        findFactors(a);
        System.out.println("Inline calculation ->" + (10 - 10 / 2) * 10 / 2);
        List<String> ilaFrnds = new ArrayList<>();
        Collections.sort(ilaFrnds, (o1, o2) -> o1.compareTo(o2));
        System.out.println();*/
        Random rand = new Random();
        int array[] = new int[10];
        for(int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(1000);
        }
        findLongestIncreasingOrder(array);
        String a = new String();
        a.trim().length();

        int A = 4;
        int upperLimit = (int)(Math.sqrt(A));
        System.out.println(upperLimit);

        System.out.println(isPrime(1));
    }

    public static void findFactors(int a) {
        int c = (a - a / 2) * (a / 2);
        System.out.println("Inline calculation ->" + c);
        int b = a / 2;
        int d = a - b;
        System.out.println("Multiple lines calculation ->" + b * d);
    }

    public static void findLongestIncreasingOrder(int [] array) {
        System.out.println("Initial array is : ");
        for(int i : array) {
            System.out.print(i + " ");
        }
        int count = 1;
        int longestSubSeqLength = 1;
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] < array[i+1]) {
                count++;
                if(longestSubSeqLength < count) {
                    longestSubSeqLength = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println("Longest sub sequence length is = " + longestSubSeqLength);
    }

    public static int isPrime(int A) {
        int upperLimit = (int)(Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) return 0;
        }
        return 1;
    }
}
