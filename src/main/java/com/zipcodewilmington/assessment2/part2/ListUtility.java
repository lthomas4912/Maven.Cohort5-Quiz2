package com.zipcodewilmington.assessment2.part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListUtility {

    ArrayList<Integer> list = new ArrayList<>();

    public Boolean add(int i) {
     return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {

        return (ArrayList) list.stream().distinct().collect(Collectors.toList());
    }

    public String join() {
         String result = list.toString().replace("[", "").replace("]", "");
         return result;
    }

    public Integer mostCommon() {

        Integer[] result = new Integer[list.size()];
        ArrayUtility array = new ArrayUtility();
        return array.mostCommon(list.toArray(result));
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
