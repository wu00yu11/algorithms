package com.learn;

/**
 * @program: algorithms
 * @description: 常量类
 *      声明为抽象类 ,禁止通过实例获取静态信息
 * @author: zjj
 * @create: 2019-11-12 14:24
 **/
public abstract class ConstantClass {
    public static String PEOPLE_NAME = "吴宇森";

    public static String getPeopleName(){
        return PEOPLE_NAME;
    }
}
