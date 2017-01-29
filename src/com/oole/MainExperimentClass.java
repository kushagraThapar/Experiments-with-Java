package com.oole;

/**
 * Created by kushagrathapar on 8/30/16 at 11:08 AM.
 */
public class MainExperimentClass {
    public static void main(String[] args) {
        int j = 0, sum = 0;
        for (int i = 1; i < 100; i++) {
            j = j++ * i;
            sum += j;
        }
        System.out.println(sum);

        WhoAmI e = new WhoAmI();
        System.out.println(e.equals(e));
    }
}
