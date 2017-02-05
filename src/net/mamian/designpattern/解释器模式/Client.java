package net.mamian.designpattern.解释器模式;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.io.InputStreamReader;

/**
 * 解释器模式：不常用
 *
 * @author mamian
 * @mail mamianskyma@aliyun.com
 * @date 2017-02-05 20:38:27
 * @copyright ©2017 马面 All Rights Reserved
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        //赋值
        HashMap<String, Integer> var = getValue(expStr);
        Calculator cal = new Calculator(expStr);
        System.out.println("运算结果为：" + expStr + "=" + cal.run(var));
    }

    //获得表达式
    public static String getExpStr() throws IOException {
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    //获得值映射
    public static HashMap<String, Integer> getValue(String exprStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //解析有几个参数要传递
        for (char ch : exprStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) { //解决重复参数的问题
                    System.out.print("请输入" + ch + "的值:");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }
}