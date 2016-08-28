package com.demo;

/**
 * Created by kushagrathapar on 12/3/15.
 */
public class FactorialClass {
    public static void main(String[] args) {
        //System.out.println(factorial(20));
        //System.out.println(factorialWithoutRecursion(9247));
        long startTime = System.currentTimeMillis();
        System.out.println(isPerfectSquare(10000000001l));
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken is : " + (endTime - startTime) + " milli seconds");
        startTime = System.currentTimeMillis();
        System.out.println(isSquare(10000000000l));
        endTime = System.currentTimeMillis();
        System.out.println("Time Taken is : " + (endTime - startTime) + " milli seconds");
    }

    public static long factorial(long a) {
        if(a == 1) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    public static boolean isSquare(long n)
    {
        long i = 1;
        while(true)
        {
            if (n < 0)
                return false;
            if (n == 0)
                return true;
            n -= i;
            i += 2;
        }
    }

    public static boolean isPerfectSquare(long a) {
        for(long i = 2; i <= Math.sqrt(a); i++) {
            if(i * i == a) {
                return true;
            }
        }
        return false;
    }

    public static double factorialWithoutRecursion(double a) {
        double factorial = 1;
        for(double i = a; i >= 2; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
