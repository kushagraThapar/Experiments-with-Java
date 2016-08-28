package com.constructor;

import com.pojo.ChildClass;

/**
 * Created by kushagrathapar on 10/26/15.
 */
public class ConstructorClassExperiment {

    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        System.out.println(checkFinallyBlock());
    }

    public static boolean checkFinallyBlock() {
        try {
            //System.exit(1);
            return true;
        } finally {
            return false;
        }
    }
}
