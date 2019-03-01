package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class WuTangConcatenator {

    private Integer result = 0;

    public WuTangConcatenator(Integer input) {

         result = input;
    }


    public Boolean isWu() {
        return result % 3 == 0;}

    public Boolean isTang() {
     return result%5 == 0;}

    public Boolean isWuTang() {

        if(isWu() && isTang()){
            return true;
        }else{
            return false;
        }
    }
}
