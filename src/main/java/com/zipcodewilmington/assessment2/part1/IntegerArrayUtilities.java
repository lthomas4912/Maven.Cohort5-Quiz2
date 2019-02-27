package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        Integer[] arg = new Integer[array.length];
        if (arg.length % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Integer[] range(int start, int stop) {


        return null;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer num = 0;
        for (int i = 0; i < array.length; i++) {

            num = array[0] + array[1];

        }
        return num;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        Integer num = 0;
        for (int i = 0; i < array.length; i++) {

            num = array[0] * array[1];

        }
        return num;
    }
}