package com.globant.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Student {
    private final String firstName;
    private final String lastName;

    private String id;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public @NotNull String getName() {
        return firstName + " " + lastName;
    }

    public @Nullable String getId() {
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }
}
