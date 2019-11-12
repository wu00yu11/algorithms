package com.learn.algorithms.bubblesort;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: algorithms
 * @description: 冒泡
 * @author: zjj
 * @create: 2019-11-05 15:31
 **/
public class BubbleSortTest {

    public static void main(String[] args) {
        int[] readyArray = {3,6,2, 10,16,23,44,13,15};
        int[] result = sort(readyArray);
        System.out.println(String.format("result array: %s", Arrays.toString(result)));
    }

    public static int[] sort(int[] array){
        int[] helloArray = array.clone();
        for (int i = 0; i < helloArray.length; i++) {
            System.out.println(String.format("i : %d",i));
            for (int j = 0; j < helloArray.length-1-i; j++) {
                System.out.println(String.format("j : %d",helloArray[j]));
                if (helloArray[j+1] < helloArray[j]){
                    swap(helloArray,j,j+1);
                }
            }
        }
        return helloArray;
    }

    private static void swap(int[] helloArray, int j, int i) {
        int temp = helloArray[j];
        helloArray[j] = helloArray[i];
        helloArray[i] = temp;
    }

}
