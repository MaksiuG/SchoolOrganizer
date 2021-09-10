package com.SchoolOrganizer;

public class Main {

    public static void main(String[] args){
        School primarySchoolNr3inCalifornia = new School();
        primarySchoolNr3inCalifornia.setName("Primary School Nr3 in California");

        Students JanIksiński = new Students();
        JanIksiński.setFullName("Jan Iksinski");
        JanIksiński.setDateOfBirth("23-08-2009");

        
        Class firstClass = new Class();
        firstClass.setName("1a");
        firstClass.setNumberOfoffice(12);
        JanIksiński.setClasss(firstClass);

    }
}
