package com.learn.algorithms.gcd;

/**
 * @author wu00y
 * 最大公约数
 */
public class Gcd {
    static int gcd(int p, int q)
    {
        if(q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    /**
     * 计算两个非负整数 p 和 q 的最小公倍数
     *  p*q / r(最大公约数)
     * */
    public static int lcm(int p, int q) {
        int p1 = p;
        int q1 = q;

        int  r= gcd(p,q);
        return (p1 * q1) / r;
    }
    public static void main(String[] args) {
        int a =35,b=70,c=0;
        c=gcd(a,b);
        System.out.println("c:"+c);
        c=lcm(a,b);
        System.out.println("c:"+c);
    }
}
