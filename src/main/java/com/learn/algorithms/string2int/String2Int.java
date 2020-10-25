package com.learn.algorithms.string2int;

/**
 * @author wu00y
 * 题目:
 * 字符串string str = "1234556"转换成int=1234556,其实现在java里面有parse.Int就可以轻松转换，想了半天才想出来答案
 *
 * 逻辑：
 * 1.先将字符串转为字符型数组String.toCharArray();
 * 2.遍历字符型数组，每一位与'0'作减法存入数值 型 数组
 * （由低到高，成为隐式转换，相减过程中会将char型先转int型然后相减速）
 * 3.遍历相减后的数值型数组每位乘以(10的length-i-1次方)然后相加
 *
 */
public class String2Int {
    public static void main(String[] args) {
        int convers = convers("569");
        System.out.println(convers);

    }

    public static int convers(String str){
        if (str == null) {
            throw new IllegalArgumentException("str is null");
        }
        char[] chars = str.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            int temp = exponential(chars.length -i -1);
            result += Integer.parseInt(String.valueOf(chars[i]))*temp;
        }
        return result;
    }

    private static int exponential(int num) {
        int temp =1;
        for (int j = num; j >0 ; j--) {
            temp *= 10;
        }
        return temp;
    }
}
