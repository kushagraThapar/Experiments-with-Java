package com.dhawal;

import java.util.*;

//This program runs in 0(N) time and O(2N) space without using a division operator
//We use stack to store intermediate result
//We could even optimize this code by removing stack and use an array

public class ArrayMultiply {

    Stack<Integer> tmpStack = new Stack<Integer>();
    int currMul = 1;
    int tempInp;

    public List<Integer> mulArray(int a[]) {
        List<Integer> result = new ArrayList<>();
        if (a.length == 0) {
            return null;
        }
        if (a.length == 1) {
            result.add(a[0]);
            return result;
        }
        for (int i = a.length - 1; i >= 1; i--) {// this loop is use to store intermediate multiplication result in a stack
            currMul = currMul * a[i];
            tmpStack.push(currMul);
        }
        currMul = 1;
        for (int i = 0; i < a.length - 1; i++) {
            tempInp = currMul * tmpStack.pop();
            currMul = currMul * a[i];
            result.add(tempInp);
            //tempInp = 1;
        }
        result.add(currMul);
        return result;

    }

    public static void main(String args[]) {

        ArrayMultiply m = new ArrayMultiply();
        int a[] = {1, 2, 3, 4, 5};
        System.out.println(m.mulArray(a));

    }
}
