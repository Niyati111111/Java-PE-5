package com.stackroute.PE5;
import java.util.*;
public class UpdateElement {

      //this function updates an element at a specific position with a new element
      public List<String> updateList(List<String> listFruits, int indexOfElement, String newElement) {

          listFruits.set(indexOfElement, newElement); //assigns the new element to the given position

          return listFruits;

      }

      //this functions removes all element and returns an empty list
      public List<String> removeElements(List<String> listFruits) {
          listFruits.clear();
          return listFruits;
      }

}
