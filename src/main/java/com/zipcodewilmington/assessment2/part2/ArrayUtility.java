package com.zipcodewilmington.assessment2.part2;




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
        for(int i = 0; i < index; i++){
            result[i] = array[index];
          for(int j = index-1; j < array.length; j++){
              result[j]= array[index];

          }
      }
      return result;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer count = 0;
        Integer counter = 0;
        Integer result = 0;
        for (Integer i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
                count++;
            }
        }
        for (Integer j = 0; j < array2.length; j++) {
            if (array2[j] == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }


    public Integer mostCommon(Integer[] array) {

        return null;
    }
}