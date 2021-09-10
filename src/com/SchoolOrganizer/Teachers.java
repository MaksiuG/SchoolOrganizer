package com.SchoolOrganizer;

import java.util.ArrayList;

public class Teachers {
    private static int id = 0;
    private String fullName;
    private ArrayList<Class> classes;
    private String subject;

    public Teachers() {
        id++;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setClasses(Class classes) {
        this.classes.add(classes);
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
