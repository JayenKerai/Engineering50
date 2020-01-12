package com.sparta.jk.engineering50;

/*
- Takes two sorted arrays (asc order) as inputs and sorts them into one larger array (asc order)
- Can be used to implement merge-sort (divide and conquer) algorithm
 */
public class MergeArraySort {
    private int[] intArray1;
    private int[] intArray2;
    private int[] newArray;

    public MergeArraySort(int[] intArray1, int[] intArray2) {
        this.intArray1 = intArray1;
        this.intArray2 = intArray2;
        newArray = new int[(intArray1.length + intArray2.length)]; //initialises newArray after lengths of input arrays can be determined
    }

    public int[] sort() {
        int pointer1 = 0;
        int pointer2 = 0;
        int newPointer = 0;

        while (pointer1 < intArray1.length && pointer2 < intArray2.length) { //while neither array has finished, take smallest number from head of either
            if (intArray1[pointer1] < intArray2[pointer2]) { //if head of array1 has smaller value
                newArray[newPointer] = intArray1[pointer1]; //add value at head of array1 to new array
                newPointer++;
                pointer1++;
            } else { //if head of array2 has smaller value
                newArray[newPointer] = intArray2[pointer2]; //add value at head of array2 to new array
                newPointer++;
                pointer2++;
            }
        }
        if (pointer1 >= intArray1.length) { //once all values reached from one array, empty rest of other array
            while (pointer2 < intArray2.length) {
                newArray[newPointer] = intArray2[pointer2];
                newPointer++;
                pointer2++;
            }
        } else {
            while (pointer1 < intArray1.length) {
                newArray[newPointer] = intArray1[pointer1];
                newPointer++;
                pointer1++;
            }
        }
        return newArray;
    }
}
