package com.logixode.rk.mergesort;

/** Proses utama MergeSort
 * @author Rohmad Kurniadi
 */
public class MergeSort {
    public static void sort( int inputArray[] ) {
        sort( inputArray, 0, inputArray.length-1 );
    }
    
    public static void sort( int inputArray[], int start, int end ) {
        if( end <= start ) {
            return;
        }
        
        int mid = (start + end)/2;

        sort( inputArray, start, mid );
        sort( inputArray, mid+1, end );
        merge( inputArray, start, mid, end );
    }
    
    public static void merge( int inputArray[], int start, int mid, int end ) {
        int tempArray[] = new int [end +1];
        
        int leftSlot = start;
        int rightSlot = mid+1;
        int i = 0;
        
        while( leftSlot <= mid && rightSlot <= end ) {
            if( inputArray[leftSlot] < inputArray[rightSlot] ) {
                tempArray[i] = inputArray[leftSlot];
                leftSlot++;
            }
            else {
                tempArray[i] = inputArray[rightSlot];
                rightSlot++;
            }
            i++;
        }
        
        if( leftSlot <= mid ) {
            while( leftSlot <= mid ) {
                tempArray[i] = inputArray[leftSlot];
                leftSlot++;
                i++;
            }
        }
        else if( rightSlot <= end ) {
            while( rightSlot <= end ) {
                tempArray[i] = inputArray[rightSlot];
                rightSlot++;
                i++;
            }
        }
        
        for (int j = 0; j < tempArray.length; j++) {
            inputArray[start+i] = tempArray[i];
        }
    }
}
