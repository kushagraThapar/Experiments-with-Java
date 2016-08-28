package com.rough;

/**
 * Created by kushagrathapar on 11/20/15.
 */
public class RohitExperiment {

    public static void main(String[] args) {
        if(args == null || args.length == 0 || args.length >= 2) {
            System.out.println("Please enter an integer number");
            System.exit(1);
        } else if(args[0].trim().isEmpty()) {
            System.out.println("Please enter an integer number [" + args[0] + "]");
            System.exit(1);
        }
        try {
            int number = Integer.parseInt(args[0]);
            if(number > 5) {
                System.out.println("Number is greater than 5");
            } else if(number < 5) {
                System.out.println("Number is smaller than 5");
            } else {
                System.out.println("Number is equal to 5");
            }
        } catch (NumberFormatException e) {
                System.out.println("This is not a number [" + args[0] + "]. Please enter a number");
        }
    }
}
