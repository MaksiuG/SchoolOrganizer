package com.SchoolOrganizer;


public class Main {

    public static void main(String[] args){
        School primarySchoolNr3inCalifornia = new School();
        primarySchoolNr3inCalifornia.setName("Primary School Nr3 in California");
        primarySchoolNr3inCalifornia.setAdress("98 Bourbon Street California");
        primarySchoolNr3inCalifornia.setNameOfHeadTeacher("Ricardo Milos");

        Teachers WadeWilson = new Teachers();
        WadeWilson.setFullName("Wade Wilson");
        WadeWilson.setSubject("PE");

        Students JanIksinski = new Students();
        JanIksinski.setFullName("Jan Iksiński");
        JanIksinski.setDateOfBirth("23-08-2009");
        JanIksinski.setTeachers(WadeWilson);


        Class firstClass = new Class();
        firstClass.setName("1a");
        firstClass.setNumberOfoffice(12);
        JanIksinski.setClasss(firstClass);
        firstClass.setStudents(JanIksinski);
        WadeWilson.setClasses(firstClass);
        firstClass.setParentTeacher(WadeWilson);

        System.out.println(JanIksinski.getParentTeacher());

    }
}
