package com.app.entities;

import java.util.Objects;

public class SoftwareEngineer {
    private int id;
    private String name;
    private String teckStack;

    public SoftwareEngineer(int id, String name, String teckStack) {
        this.id = id;
        this.name = name;
        this.teckStack = teckStack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeckStack() {
        return teckStack;
    }

    public void setTeckStack(String teckStack) {
        this.teckStack = teckStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(teckStack, that.teckStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, teckStack);
    }
}
