package com.stackroute.PE5;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import static org.junit.Assert.*;

public class UpdateElementTest {

    UpdateElement updateElement;

    @Before
    public void setUp() {
        updateElement = new UpdateElement();
    }

    @After
    public void tearDown() {
        updateElement = null;
    }

    @Test
    public void inputListUpdateElement() {    //checks whether the expected output matches the result
        List<String> listFruits = new ArrayList<>();
        listFruits.add("apple");
        listFruits.add("grape");
        listFruits.add("melon");
        listFruits.add("berry");
        List<String> result = updateElement.updateList(listFruits,0,"kiwi");
        List<String> expected = new ArrayList<>();
        expected.add("kiwi");
        expected.add("grape");
        expected.add("melon");
        expected.add("berry");
        assertEquals(expected,result);
        assertNotNull(updateElement);
    }

    @Test
    public void inputListReturnEmptyList() {   //checks whether the expected output matches the result
        List<String> listFruits = new ArrayList<>();
        listFruits.add("apple");
        listFruits.add("grape");
        listFruits.add("melon");
        listFruits.add("berry");
        List<String> result = updateElement.removeElements(listFruits);
        List<String> expected = new ArrayList<>();
        assertEquals(expected,result);
    }

    @Test
    public void inputNullElementRaiseException() { //checks for exception
        List<String> listFruits = new ArrayList<>();
        listFruits.add(null);
        listFruits.add(null);
        listFruits.add(null);
        listFruits.add(null);
        List<String> result = updateElement.updateList(listFruits,0,"kiwi");
    }

}