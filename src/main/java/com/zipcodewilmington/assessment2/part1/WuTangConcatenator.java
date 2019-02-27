package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class WuTangConcatenator {

    public WuTangConcatenator(Integer input) {

          input = isWu().compareTo(isTang());
    }


    public Boolean isWu() {
       Integer input = Integer.MAX_VALUE;

        if (input%3 == 0){
            return true;
        }else {
            return false;
        }


    }

    public Boolean isTang() {
        Integer input = Integer.MAX_VALUE;
        if(input%5 == 0){
           return true;
       }else {
           return false;
       }
    }

    public Boolean isWuTang() {
        Integer input = Integer.MAX_VALUE;
        if(isWu() && isTang()){
            return true;
        }else{
            return false;
        }
    }
}
