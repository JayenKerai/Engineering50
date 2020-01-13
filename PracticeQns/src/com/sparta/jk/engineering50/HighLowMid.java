package com.sparta.jk.engineering50;

import java.util.Arrays;

public class HighLowMid {
    int[] intArray;

    public HighLowMid(int[] intArray) {
        Arrays.sort(intArray);
        this.intArray = intArray;
    }

    public int getHigh(){
        return intArray[intArray.length-1];
    }

    public int getMid(){
        return intArray[intArray.length/2];
    }

    public int getLow(){
        return intArray[0];
    }
}
