package com.stackroute.PE5;

import java.util.Comparator;

public class StudentSorterNew  implements  Comparator<StudentSorter> {

    @Override
    public int compare(StudentSorter student1, StudentSorter student2) {

       if(student1.age == student2.age) {  //first check age
           if (student1.name == student2.name) { //if age is equal check the names
               if (student1.id == student2.id) { //if names are equal then check the ids
                   return 0;
               } else if (student1.id > student2.id) {
                   return 1;
               } else {
                   return -1;
               }
           } else {
               return 1;
           }
       }else if (student1.age > student2.age) {
           return -1;
       } else {
           return 1;
       }

    }

}
