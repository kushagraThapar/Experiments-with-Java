package com.krutarth;

/**
 * Created by kushagrathapar on 4/9/16.
 */
public class CodeNationTest {
    public static void main(String[] args) {
        System.out.println(power(3,3));
        System.out.println(ipow(3,4));
    }

    public static int func2(int y, int x) {
        int z = 1;
        z = z << y;
        return (x & z);
    }

    public static int power(int a, int b) {
        int x = a, y = 1;
        for (int i = 0; i < b; i++) {
            if (func2(a, i) == 1) {
                System.out.println("Value " + i);
                y = y + x;
            }
            x = x * x;
        }
        return y;
    }


    public static int ipow(int base, int exp)
    {
        int result = 1;
        while (exp != 0)
        {
            if ((exp & 1) == 1)
                result *= base;
            exp >>= 1;
            base *= base;
        }

        return result;
    }


}
