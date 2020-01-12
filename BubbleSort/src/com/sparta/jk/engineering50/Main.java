package com.sparta.jk.engineering50;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {1, 3, 4, 2, 6, 5, 2, 3, 10, 7, 9, 10, 9};
        BubbleSort bubbleSort = new BubbleSort(intArray);

        int[] sortedAsc = bubbleSort.sortDesc();
        System.out.println(Arrays.toString(sortedAsc)); //prints ascending bubble-sorted intArray

        int[] sortedDesc = bubbleSort.sortAsc();
        System.out.println(Arrays.toString(sortedDesc)); //prints descending bubble-sorted intArray

    }
}
