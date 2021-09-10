package com.SchoolOrganizer;

import java.util.ArrayList;
import java.util.Date;

public class Students extends Class{
    private static int id = 0;
    private String fullName;
    private String dateOfBirth;
    private ArrayList<Teachers> teachers;
    private Class Classs;


    public static void setId(int id) {
        Students.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers.add(teachers);
    }

    public void setClasss(Class classs) {
        Classs = classs;
    }

    public static int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public ArrayList<Teachers> getTeachers() {
        return teachers;
    }

    public Class getClasss() {
        return Classs;
    }
}
