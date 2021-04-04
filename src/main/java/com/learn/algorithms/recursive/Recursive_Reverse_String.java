package com.learn.algorithms.recursive;

/**
 * 递归算法
 * 反转字符串
 * @author wu00y
 */
public class Recursive_Reverse_String {
    /**
     * 1.退出条件
     * 2.入参中要带有迭代对象
     */
    static String reverse(char[] str,int n){
        if (n == 0) {
            return "";
        }
        return str[n-1] + reverse(str,n-1);
    }

    public static void main(String[] args) {
        String str = "hello world";
        String result = reverse(str.toCharArray(),str.length());
        System.out.println(result);
    }
}
