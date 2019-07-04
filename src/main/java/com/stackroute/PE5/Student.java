package com.stackroute.PE5;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

    public ArrayList<StudentSorter> checkStudents() {

        ArrayList<StudentSorter> studentSorters = new ArrayList<StudentSorter>();
        //adds the name of the students to the list
        studentSorters.add(new StudentSorter(3, "rahul", 24));
        studentSorters.add(new StudentSorter(7, "vinay", 23));
        studentSorters.add(new StudentSorter(9, "ananya", 23));
        studentSorters.add(new StudentSorter(5, "sneha", 22));
        studentSorters.add(new StudentSorter(2, "sandhya", 21));

        return studentSorters;

    }

}
