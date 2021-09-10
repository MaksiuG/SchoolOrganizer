package com.SchoolOrganizer;

import java.util.ArrayList;

public class School {
    private String name;
    private String nameOfHeadTeacher;
    private ArrayList<Teachers> teachers;
    private ArrayList<Students> students;
    private String adress;
    private Class[] classes;

    public void setName(String name) {
        this.name = name;
    }

    public void setNameOfHeadTeacher(String nameOfHeadTeacher) {
        this.nameOfHeadTeacher = nameOfHeadTeacher;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setClasses(Class[] classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getNameOfHeadTeacher() {
        return nameOfHeadTeacher;
    }

    public String getAdress() {
        return adress;
    }

    public Class[] getClasses() {
        return classes;
    }

    public ArrayList<Teachers> getTeachers() {
        return teachers;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setTeachers(ArrayList<Teachers> teachers) {
        this.teachers = teachers;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }
}
