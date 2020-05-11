package com.logixode.rk.mergesort;

/** Main Class 
 * @author Rohmad Kurniadi
 */
public class Main {
    public static void main(String[] args) {
        int inputArray[] = {
            9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0
        };
        MergeSort sorter = new MergeSort();
        
        sorter.sort(inputArray);
        
//        for (int i : inputArray) {
//            System.out.print(i + ", ");
//        }
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + ", ");
        }
    }
}
