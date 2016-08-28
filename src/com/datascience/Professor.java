package com.datascience;

import java.util.Set;

/**
 * Created by kushagrathapar on 2/19/16.
 */
public class Professor {
    String firstName;
    String lastName;
    Set<String> courses;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Professor professor = (Professor) o;

        return lastName != null ? lastName.equals(professor.lastName) : professor.lastName == null;

    }

    @Override
    public int hashCode() {
        return lastName != null ? lastName.hashCode() : 0;
    }
}
