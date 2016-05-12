package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void combSort(int[] array){
        int gap = array.length;
        boolean swapped = true;
        while (gap > 1 || swapped){
            if (gap > 1){
                gap = (int) (gap / 1.247330950103979); // 1.247... is optimal decrease factor
            }
            int i = 0;
            swapped = false;
            while (i + gap < array.length){
                if (array[i] > array[i + gap]){
                    swap(array, i, i + gap);
                    swapped = true;
                }
                i++;
            }
        }
    }

    public static void swap(int[] array, int first, int second){
        int temp;
        temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
