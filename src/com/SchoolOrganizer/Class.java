package com.SchoolOrganizer;

import java.util.ArrayList;

public class Class{
    private String name;
    private int numberOfoffice;
    private ArrayList<Students> students;
    private String parentTeacher;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfoffice(int numberOfoffice) {
        this.numberOfoffice = numberOfoffice;
    }

    public void setStudents(Students students) {
        this.students.add(students);
    }
    public void setParentTeacher(String parentTeacher) {
        this.parentTeacher = parentTeacher;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfoffice() {
        return numberOfoffice;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public String getParentTeacher() {
        return parentTeacher;
    }
}
