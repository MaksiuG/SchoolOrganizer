package com.SchoolOrganizer;

import java.util.ArrayList;

public class School {
    private String name;
    private String nameOfHeadTeacher;
    private ArrayList<Teachers> teachers = new ArrayList<>();
    private ArrayList<Students> students = new ArrayList<>();
    private String adress;
    private ArrayList <Class> classes = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setNameOfHeadTeacher(String nameOfHeadTeacher) {
        this.nameOfHeadTeacher = nameOfHeadTeacher;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setClasses(ArrayList<Class> classes) {
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

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public ArrayList<Teachers> getTeachers() {
        return teachers;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers.add(teachers);
    }

    public void setStudents(Students students) {
        this.students.add(students);
    }
}
