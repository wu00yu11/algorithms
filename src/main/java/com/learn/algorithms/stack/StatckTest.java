package com.learn.algorithms.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author jingjing.zhang
 */
public class StatckTest {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        char[] chars = s.toCharArray();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i < s.length();i++){
            if(!map.containsKey(chars[i])) {
                //为左括号时直接入栈
                stack.push(chars[i]);
            }else{
                //为右括号时，如果栈为空或者栈顶与该括号类型不匹配返回false
                if(stack.empty() || map.get(chars[i]).equals(stack.pop())){
                    return false;
                }
            }
        }
        //字符串遍历完毕后，如果栈为空返回true，反之返回false
        return stack.empty();
    }

    public static void main(String[] args) {
        String params = "()[]{}";
        boolean result = isValid(params);
        System.out.println(result);
    }
}
