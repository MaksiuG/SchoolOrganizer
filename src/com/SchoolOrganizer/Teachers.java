package com.SchoolOrganizer;

import java.util.ArrayList;

public class Teachers {
    private static int id = 0;
    private String fullName;
    private ArrayList<Class> classes;

    public Teachers() {
        id++;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    public static int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }
}
