package com.krutarth;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by kushagrathapar on 2/2/16.
 */
public class GridClassExperiment {

    public static void main(String[] args) {
        System.out.println(numPaths(20, 20));
        int[] in = {6, 2, 3, 4, 5};
        array(in);
    }

    public static long numPaths(long m, long n) {
        BigInteger result;
        BigInteger num = BigInteger.ONE;
        long den = 1;
        for (long i = 0; i < n; i++) {
            System.out.println("Num before [" + num + "]");
            System.out.println("This is the multiplier [" + (m + n - i) + "]");
            num = num.multiply(BigInteger.valueOf(m + n - i));
            System.out.println("Num After [" + num + "]");
            den = den * (n - i);
        }
        result = num.divide(BigInteger.valueOf(den));
        return result.longValue();
    }


    private static int[] array(int[] in) {
        int[] a1 = new int[in.length];
        Arrays.fill(a1, 1);
        int[] a2 = new int[in.length];
        Arrays.fill(a2, 1);
        int[] ar = new int[in.length];
        Arrays.fill(ar, 1);
        final int l = in.length;
        for (int i = 0, p = 1; i < l; i++) {
            a1[i] *= p;
            p *= in[i];
        }
        for (int i = l - 1, p = 1; i >= 0; i--) {
            a2[i] *= p;
            p *= in[i];
        }
        for (int i = 0; i < l; i++) {
            ar[i] = a1[i] * a2[i];
            System.out.println(ar[i]);
        }
        return ar;

    }

    /*Node parentNode(Node root, Node n1, Node n2) {
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        if(left == null && right == null) {
            return null;
        } else if(left == null)
            return right;
        else
            return left;
    }

    Node lca(Node root, Node n1, Node n2) {
        if (root == null) {
            return null;
        }

        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (root.data > n1.data && root.data > n2.data) {
            return lca(node.left, n1, n2);
        }

        // If both n1 and n2 are greater than root, then LCA lies in right
        if (root.data < n1.data && root.data < n2.data) {
            return lca(node.right, n1, n2);
        }

        return node;
    }
*/


}
