package com.logixode.rk.selectionsort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohmad
 */
public class Main {
    public static void main(String[] args) {
        int myArray[] = selectionSort( 
            new int[] {9,8,3,13,87,12,99}
        );
        
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
    
    public static int [] selectionSort( int a[] ) {
        for (int i = 0; i < a.length; i++) {
            int minimum = i;
            
            for (int j = i+1; j < a.length; j++) {
                if ( a[j] < a[minimum] ) {
                    minimum = j;
                }
            }
            
            int temp = a[i];
            
            a[i] = a[minimum];
            a[minimum] = temp;
        }
        return a;
    }
}
