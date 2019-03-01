package com.zipcodewilmington.assessment2.part2;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer arrayLen = array1.length;
        Integer arrayLen2 = array2.length;

        Integer[] result = new Integer[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, arrayLen);
        System.arraycopy(array2, 0, result, arrayLen, arrayLen2);

        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
       Integer [] result = Arrays.copyOfRange(array, index, array.length);
       Integer [] result1 = Arrays.copyOfRange(array, 0, index);
       return merge(result,result1);


     }


    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
      Integer count = 0;
      for (Integer i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
               count++; }
        } for (Integer j = 0; j < array2.length; j++) {
           if (array2[j] == valueToEvaluate) {
               count++; }
       }
        return count;
    }


    public Integer mostCommon(Integer[] array) {
        Integer common = array[0];
        for(Integer integer : array){
            if(countOccurrence(array,array,integer) > countOccurrence(array,array, common)){
                common = integer;
            }
        }
        return common;
    }
}