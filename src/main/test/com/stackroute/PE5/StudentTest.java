package com.stackroute.PE5;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student student;

    @Before
    public void setUp() {
        student = new Student();
    }

    @After
    public void tearDown() {
        student = null;
    }

    @Test
    public void returnsSortedList() {   //checks whether the expected output matches the result
        ArrayList<StudentSorter> expected = new ArrayList<StudentSorter>();
        ArrayList<StudentSorter> result = new ArrayList<StudentSorter>();
        expected.add((new StudentSorter(3, "rahul", 24)));
        expected.add((new StudentSorter(7, "vinay", 23)));
        expected.add((new StudentSorter(9, "ananya", 23)));
        expected.add((new StudentSorter(5, "sneha", 22)));
        expected.add((new StudentSorter(2, "sandhya", 21)));
        result = student.checkStudents();
        Assert.assertEquals(expected.toString(), result.toString());

        assertNotNull(student);

    }

}