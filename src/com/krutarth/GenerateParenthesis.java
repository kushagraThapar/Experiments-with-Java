package com.krutarth;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kushagrathapar on 2/28/16.
 */
public class GenerateParenthesis {

    public static int count = 0;

    public static void main(String[] args) {
        List<String> resultList = brackets(6, 0, "", new ArrayList<>());
        System.out.println(resultList);
    }

    public static List<String> brackets(int open, int close, String s, List<String> resultList) {
        if(resultList == null) {
            resultList = new ArrayList<>();
        }
        if (open == 0 && close == 0) {
            resultList.add(s);
            return resultList;
        }
        if (open > 0) {
            resultList = brackets(open - 1, close + 1, s + "(", resultList);
        }
        if (close > 0) {
            resultList = brackets(open, close - 1, s + ")", resultList);
        }
        return resultList;
    }
}
