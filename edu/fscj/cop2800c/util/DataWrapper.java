// DataWrapper.java
// Rhett Smith
// 11/20/2026
// Generic utility class for storing and displaying data

package edu.fscj.cop2800c.util;

import java.util.List;

public class DataWrapper<T> {

    // Private field
    private T value;

    // Default constructor
    public DataWrapper() {
        this.value = null;
    }

    // Constructor with a parameter
    public DataWrapper(T value) {
        this.value = value;
    }

    // Getter method
    public T getValue() {
        return value;
    }

    // Display all elements in the list
    public static <T> void displayList(List<DataWrapper<T>> list) {
        for (DataWrapper<T> element : list) {
            // Display the wrapped object's value
            System.out.println(element.getValue());
        }
    }
}
