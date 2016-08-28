package com.pojo;

/**
 * Created by kushagrathapar on 2/8/16.
 */
public class StudentClass implements Comparable<StudentClass> {

    public String name;
    public int rollNo;

    public StudentClass(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public int compareTo(StudentClass o) {
        if(o == null) {
            return 1;
        }
        return this.name.compareTo(o.name);
    }
}
