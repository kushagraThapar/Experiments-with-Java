package com.krutarth;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Krutarth on 2016-01-30.
 * Given 'n', this Piece of code calculates the nth
 * prime number.
 * E.g. n=5 -> result=11
 * Time complexity - O(n^2)
 * Space complexity - O(n^2)
 */

public class ThousandthPrime {

    public static void main(String[] args) {
        createAList();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int in = sc.nextInt();
            long s = System.currentTimeMillis();
            System.out.println(findNthPrime(in));
            long ta = System.currentTimeMillis();
            System.out.println(ta - s);
        }
    }

    public static void createAList() {
        for (int i = 0; i < primes.length; i++) {
            primeList.add(primes[i]);
        }
    }

    public static long findNthPrime(long in) {

        if (in < primeList.size() + 1) {
            return (primeList.get((int) in - 1));
        }

        long num = primeList.get(primeList.size()-1);
        if (num%6==1){
            num += 5;
        }
        else {
            num += 7;
        }
        long counter = primeList.size();
        long nextNum;

        while (true) {
            nextNum = num - 1;
            if (isPrime(nextNum)) {
                counter++;
                if (counter == in)
                    return nextNum;
            }
            nextNum = num + 1;
            if (isPrime(nextNum)) {
                counter++;
                if (counter == in)
                    return nextNum;
            }
            num += 6;
        }
    }

    public static boolean isPrime(long in) {

        boolean bubli = true;
        if (in <= 1) {
            bubli = false;
        } else if (in <= 3) {
            bubli = true;
        } else if (in % 2 == 0 || in % 3 == 0 || in % 5 == 0) {
            bubli = false;
        }
        int i = 3;

        while (primeList.get(i) * primeList.get(i) <= in) {
            if (in % primeList.get(i) == 0) {
                bubli = false;
            }
            i++;
        }
        if (bubli && primeList.get(i - 1) * primeList.get(i - 1) <= in)
            primeList.add((int) in);

        return bubli;
    }

    public static ArrayList<Integer> primeList = new ArrayList<>();
    public static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
}