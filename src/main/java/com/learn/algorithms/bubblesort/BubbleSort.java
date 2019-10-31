package com.learn.algorithms.bubblesort;

import java.util.Arrays;

/**
 * <strong>思路:</strong>
 * 将序列当中的左右元素，依次比较，保证右边的元素始终大于左边的元素；（ 第一轮结束后，序列最后一个元素一定是当前序列的最大值；）
 * 对序列当中剩下的n-1个元素再次执行步骤1。
 * 对于长度为n的序列，一共需要执行n-1轮比较
 * <strong>时间复杂度:</strong>
 * 最佳情况：T(n) = O(n) 最差情况：T(n) = O(n2) 平均情况：T(n) = O(n2)
 * @author: zjj
 * @create: 2019-10-28 10:40
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 8, 1, 11, 8};
        int[] results = bubbleSort(arr);
        System.out.println(String.format("排序输出结果: %s", Arrays.toString(results)));
    }

    /**
     * 冒泡排序,升序排列
     * 数组当中比较小的数值向下沉，数值比较大的向上浮！
     */
    public static int[] bubbleSort(int[] arr) {
        // 外层for循环控制循环次数
        for(int i=0;i<arr.length;i++){
            // 内层for循环控制相邻的两个元素进行比较
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] orgiArray,int i,int j){
        int temp = orgiArray[i];
        orgiArray[i] = orgiArray[j];
        orgiArray[j] = temp;
    }

}
