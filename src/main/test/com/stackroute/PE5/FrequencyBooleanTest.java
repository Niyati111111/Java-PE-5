package com.stackroute.PE5;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class FrequencyBooleanTest {

    FrequencyBoolean frequencyBoolean;

    @Before
    public void setUp() {
        frequencyBoolean = new FrequencyBoolean();
    }

    @After
    public void tearDown() {
        frequencyBoolean = null;
    }

    @Test
    public void inputStringReturnString() {   //checks whether the expected output matches the result
        String input = "one one -one___two,,three,one @three*one?two";
        String result = frequencyBoolean.checkFrequency(input);
        String expected = "{one=true, two=true, three=true}";
        assertEquals(expected,result);
    }

    @Test
    public void inputString1ReturnString() {   //checks whether the expected output matches the result
        String input = "one one -one___two,,1234,5678 @three*one?two";
        String result = frequencyBoolean.checkFrequency(input);
        String expected = "{1234=false, one=true, 5678=false, two=true, three=false}";
        assertEquals(expected,result);
    }

    @Test
    public void inputEmptyStringReturnNull() {   //checks whether the expected output matches the result
        String result = frequencyBoolean.checkFrequency("");
        assertEquals("Empty String is not allowed!",result);
    }

    @Test(expected = NullPointerException.class) //checks for exception
    public void inputNullRaiseExceptions() {
        String result = frequencyBoolean.checkFrequency(null);
    }

}