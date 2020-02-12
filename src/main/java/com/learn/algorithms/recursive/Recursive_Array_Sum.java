package com.learn.algorithms.recursive;


/**
 * 递归算法
 * 数组递归求和
 * @author wu00y
 */
public class Recursive_Array_Sum {

    static int GetSum(int[] a, int n)
    {
        if (n == 0){
            return 0;
        }
        return GetSum(a,n - 1) + a[n-1];
    }

    public static void main(String[] args) {
        int a[] = { 3, 6, 8, 2, 1 };
        int sum =   GetSum(a, a.length);
        System.out.println(String.format("sum is %d", sum));
    }
}
