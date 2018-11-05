package com.example.dependencytest;

import com.google.common.base.Objects;

/**
 * This is some model.
 */
public class SomeModel {

    private int someField;

    /**
     * Constructs some model.
     * @param someField field to construct model with
     */
    public SomeModel(int someField) {
        this.someField = someField;
    }

    /**
     * @return some field
     */
    public int getSomeField() {
        return someField;
    }

    public void setSomeField(int someField) {
        this.someField = someField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeModel someModel = (SomeModel) o;
        return someField == someModel.someField;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(someField);
    }
}
