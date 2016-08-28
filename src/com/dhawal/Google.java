package com.dhawal;

import java.util.Scanner;

/**
 * Created by kushagrathapar on 3/6/16.
 */
public class Google {

    public static boolean boggleDriver(char a[][], String target) {
        return is_WordExist(a, "", target, 0, 0, target.length());

    }

    public static boolean is_WordExist(char a[][], String result, String word, int i, int j, int len) {
        boolean temp = false;
        if (result.length() == len) {
            System.out.println(result);
            return true;
        }
        for (int ind = i; ind < 2; ind++) {
            for (int colind = j; colind < 3; colind++) {
                try {
                    if (a[ind][colind] == word.charAt(0))
                        temp = is_WordExist(a, result + word.charAt(0), word.substring(1), ind, colind, len);
                    else {
                        if (a[ind + 1][colind] == word.charAt(0))
                            temp = is_WordExist(a, result + word.charAt(0), word.substring(1), ind + 1, colind, len);
                        if (a[ind][colind + 1] == word.charAt(0))
                            temp = is_WordExist(a, result + word.charAt(0), word.substring(1), ind, colind + 1, len);
                        if(temp)
                            return true;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(ind + "] [" + colind);
                    throw e;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        char a[][] = new char[3][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.next().charAt(0);
            }
        }
        String target = sc.next();
        try {
            boggleDriver(a, target);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

