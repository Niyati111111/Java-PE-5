package com.stackroute.PE5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequency {

    //        Map<String,Integer> as key value pair.
    //        Input : String str = “one one -one___two,,three,one @three*one?two”;
    //        Output : {"one":5 , "two":2, "three" :2}
    public String checkFrequency(String input) {
        if (input == "")
            return "Empty String is not allowed!";

        List<String> stringList = Arrays.asList(input.split("[\\W_]+")); //splits the string wherever there is a non-word character
        Map<String, Integer> map = new HashMap<>();
        for (String each : stringList) { //for each element in string list
            if (map.containsKey(each)) {
                map.replace(each, map.get(each) + 1); //if map contains the key, increase it's corresponding value by one
            } else {
                map.put(each, 1); //else, put the element in map and store it's frequency as one
            }
        }

        return map.toString(); //convert the map to string and return it
    }


}
