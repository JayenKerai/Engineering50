package com.sparta.jk.engineering50;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3, 4, 6}; //input array 1
        int[] intArray2 = {1, 2, 5, 10, 15, 20, 30}; //input array 2
        int[] intArray3 = {9, 6, 8, 2, 5, 1, 2, 5, 10, 15, 20, 30}; //input array 3


        MergeArraySort mergeArraySort = new MergeArraySort();
        //int[] sortedArray = mergeArraySort.merge(intArray1, intArray2);
        int[] sortedArray =  mergeArraySort.sort(intArray3);
        System.out.println(Arrays.toString(sortedArray)); // prints sortedArray

    }
}
