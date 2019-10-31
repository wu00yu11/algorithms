package com.learn.algorithms.insertSort;

import java.util.Arrays;
import java.util.Random;

/**
 * @program: springmvc-source
 * @description: 插入排序
 * @author: zjj
 * @create: 2019-10-30 16:52
 **/
public class InsertSort {
    /**
     * 初始化数据容量
     */
    private static int INITARRAYLENGTH = 10000;

    enum OrderType{
        ASC,DESC

    }


    public static void main(String[] args) {
        /*随机初始化数组*/
        int[] sourceArray = radomeArray(INITARRAYLENGTH);
        /*输出原值*/
        System.out.println(String.format("orgine date: \n %s",Arrays.toString(sourceArray)));
        /*排序*/
        int[] resultArray = insetSort(sourceArray);
        /*输出排序结果*/
        System.out.println(String.format("sort result: \n %s",Arrays.toString(resultArray)));
        /*对排序结果进行校验*/
        validateSortResult(resultArray, OrderType.ASC);
    }

    /**
     * 校验排序结果
     * @param resultArray 排序结果集
     * @param orderType 结果集排序方式,从小到大还是从大到小
     */
    private static void validateSortResult(int[] resultArray,OrderType orderType) {

        for (int i = 0; i < resultArray.length-1; i++) {
            if (orderType == OrderType.ASC) {
                if (resultArray[i + 1] < resultArray[i]) {
                    System.out.println(String.format("sort fail, exsist illegal date %d , %d", resultArray[i], resultArray[i + 1]));
                }
            }
            if (orderType == OrderType.DESC){
                if (resultArray[i + 1] > resultArray[i]) {
                    System.out.println(String.format("sort fail, exsist illegal date %d , %d", resultArray[i], resultArray[i + 1]));
                }
            }
        }
    }

    /**
     * 随机数值创建一个数组
     * @param capacity
     * @return
     */
    private static int[] radomeArray(int capacity) {
        int[] arrary = new int[capacity];
        for (int i = 0; i < arrary.length; i++) {
            arrary[i] = new Random().nextInt(20000);
        }
        return arrary;
    }

    public static int[] insetSort(int[] sourceArrary){
        int[] readyArray = sourceArrary.clone();
        for (int i = 1; i < readyArray.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if (readyArray[j]<readyArray[j-1]){
                    swap(readyArray,j,j-1);
                }else{
                    break;
                }
            }
        }
        return readyArray;
    }

    /**
     * 数值交换
     * @param sourceArrary
     * @param i
     * @param j
     */
    public static void swap(int[] sourceArrary, int i, int j){
        int temp =sourceArrary[i];
        sourceArrary[i] = sourceArrary[j];
        sourceArrary[j] = temp;
    }

}
