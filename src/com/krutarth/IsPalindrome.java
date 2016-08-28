package com.krutarth;

/**
 * Created by kushagrathapar on 2/10/16.
 */
public class IsPalindrome {

    public static void main(String[] args) {
        String s = "a.";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if(s == null)
            return false;
        if(s.isEmpty())
            return true;
        int low = 0;
        int high = s.length()-1;
        boolean lowChar;
        boolean highChar;
        s = s.toLowerCase();
        while (low <= high){
            lowChar = Character.isLetterOrDigit(s.charAt(low));
            highChar = Character.isLetterOrDigit(s.charAt(high));
            if (lowChar && highChar) {
                if (s.charAt(low) != s.charAt(high)) {
                    return false;
                }
                low++;
                high--;
            } else if (!lowChar) {
                low++;
            } else {
                high--;
            }
        }
        return true;
    }
}
