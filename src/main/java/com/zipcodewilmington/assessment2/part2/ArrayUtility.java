package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

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
        Integer [] result = new Integer[array.length];
            for(int i = 0; i < array.length-1; i++){
            result = new Integer[(i+index) % array.length];

    }
            return result;
}

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        Integer count2= 0;
        Integer result = 0;
        for (int i = 0; i < array1.length; i++) {
            count++;
            for (int j = 0; j < array2.length; j++) {
                count2++;
                if (array1[i] == valueToEvaluate & array2[j] == valueToEvaluate) {
                   result = count + count2;
                }

            }
        } return result;
    }


            public Integer mostCommon (Integer[]array){

        Integer result = array.length;
            Integer count=0;

            for(int i = 0; i < array.length; i ++)
            for (Integer num : array){
                    count++;
                    num = count;
                if(count > result){
                    result = count;
                }
            } return result;
        }

    }