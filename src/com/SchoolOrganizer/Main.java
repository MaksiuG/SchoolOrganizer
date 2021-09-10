package com.SchoolOrganizer;

public class Main {

    public static void main(String[] args){
        School primarySchoolNr3inCalifornia = new School();
        primarySchoolNr3inCalifornia.setName("Primary School Nr3 in California");
        primarySchoolNr3inCalifornia.setAdress("98 Bourbon Street California");
        primarySchoolNr3inCalifornia.setNameOfHeadTeacher("Ricardo Milos");

        Teachers WadeWilosn = new Teachers();
        WadeWilosn.setFullName("Wade Wilosn");
        WadeWilosn.setSubject("PE");
        
        Students JanIksiński = new Students();
        JanIksiński.setFullName("Jan Iksinski");
        JanIksiński.setDateOfBirth("23-08-2009");
        JanIksiński.setTeachers(WadeWilosn);

        Class firstClass = new Class();
        firstClass.setName("1a");
        firstClass.setNumberOfoffice(12);
        JanIksiński.setClasss(firstClass);
        firstClass.setStudents(JanIksiński);
        WadeWilosn.setClasses(firstClass);


    }
}
