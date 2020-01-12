package com.sparta.jk.engineering50;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3, 4, 6}; //input array 1
        int[] intArray2 = {1, 2, 5, 10, 15, 20, 30}; //input array 2

        MergeArraySort mergeArraySort = new MergeArraySort(intArray1, intArray2);
        int[] sortedArray = mergeArraySort.sort();
        System.out.println(Arrays.toString(sortedArray)); // prints sortedArray

    }
}
