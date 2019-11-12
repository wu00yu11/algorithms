package com.learn;

import org.junit.Test;

/**
 * @program: algorithms
 * @description:
 * @author: zjj
 * @create: 2019-11-12 14:14
 **/
public class InnerTest {
    @Test
    public void test1(){
        TestInnerClass.Inner  inner =  new TestInnerClass.Inner(18,"zhangsan");
        System.out.println(inner.toString());
    }
}
