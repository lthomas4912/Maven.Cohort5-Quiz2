package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class WuTangConcatenator {

    private Integer result = 0;

    public WuTangConcatenator(Integer input) {

         result = input;
    }


    public Boolean isWu() {
        if (result % 3 == 0) {
            return true;
   } else {
            return false;
        }
    }

    public Boolean isTang() {
           if(result%5 == 0){
               return true;
           }else{
               return false;
           }
    }

    public Boolean isWuTang() {

        if(isWu() && isTang()){
            return true;
        }else{
            return false;
        }
    }
}
