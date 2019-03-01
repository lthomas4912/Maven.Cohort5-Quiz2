package com.zipcodewilmington.assessment2.part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListUtility {

    private List<Integer> list = new ArrayList<>();
                //changed from int to Integer
    public Boolean add(Integer i) {
     return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
    List<Integer> unique = new ArrayList<>();
    for(Integer number : list){
        if(!unique.contains(number)){
            unique.add(number);
        }
    }return unique;
    }

    public String join() {
         String result = list.toString().replace("[", "").replace("]", "");
         return result;
    }

    public Integer mostCommon() {
       Integer common = list.get(0);
       int commonCount = count(common);
       for(Integer currentNumber : list){
           int currentCount = count(currentNumber);
           if (currentCount > commonCount){
               common = currentNumber;
               commonCount = currentCount;
           }
       } return common;
    }
    private int count (Integer valueToCount) {
        int count = 0;
        for (Integer currentValue : list) {
            if (currentValue == valueToCount) {
                count++;
            }
        } return count;
    }


    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
