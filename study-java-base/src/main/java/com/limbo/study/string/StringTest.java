package com.limbo.study.string;

import org.junit.Test;

/**
 * StringTest
 *
 * @author : limbo
 * @date : 2020/9/7
 */
public class StringTest {

    /**
     * 测试intern()方法的作用
     */
    @Test
    public void test1() {
        String c = "abcd";
        // 避免“abcd”的方式放入常量池
        String a1 = "ab";
        String a2 = "cd";
        // 创建对象a
        String a = a1 + a2;
        if (a == c) {
            System.out.println("a被加入常量池中，没有新建对象");
        } else {
            System.out.println("a没有被加入常量池中，新建对象");
        }

        // 如果对象a的值不存在常量池中，则a放到常量池中
        String b = a.intern();
        if (b == a) {
            System.out.println("a被加入常量池中，没有新建对象");
        } else {
            System.out.println("a没有被加入常量池中，新建对象");
        }

        // 定义不存在常量池中的字符串
        String e = a1 + a2 +a1;
        // 如果对象e的值不存在常量池中，则e放到常量池中
        String f = e.intern();
        if (e == f) {
            System.out.println("e被加入常量池中，没有新建对象");
        } else {
            System.out.println("e没有被加入常量池中，新建对象");
        }
    }


    /**
     * "aa"常量固定的方式创建的字符串会被放入常量池中，"ab + "bc"也是常量固定的
     * a对象拼接"bc"的方式创建不会放在常量池中，只有参与拼接的有对象就不会放到常量池
     */
    @Test
    public void test2() {
        // 使用数组char创建，避免“abcd”的方式放入常量池
        String a = "ab";
        String b = "cd";
        String c = "abcd";
        String d = "ab" + "cd";
        if (c == d) {
            System.out.println("\"ab\" + \"cd\"被加入常量池中，没有新建对象");
        } else {
            System.out.println("\"ab\" + \"cd\"没有被加入常量池中，新建对象");
        }

        String e = a + "cd";
        if (c == e) {
            System.out.println("a + \"cd\"被加入常量池中，没有新建对象");
        } else {
            System.out.println("a + \"cd\"没有被加入常量池中，新建对象");
        }

        String f = "ab" + b;
        if (c == f) {
            System.out.println("\"ab\" + b被加入常量池中，没有新建对象");
        } else {
            System.out.println("\"ab\" + b没有被加入常量池中，新建对象");
        }
    }

    /**
     * 一个中文汉字是否能保存在char中
     */
    @Test
    public void test3(){
        char a = '中';
        char b = '文';
        char c = '大';
        char d = '小';
        System.out.println(a + b + c + d);
        System.out.println(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
    }

    /**
     * 字符串反转
     */
    @Test
    public void test4(){
        String a = "A quick brown fox jumps over the lazy dog.";
        System.out.println("原始字符串：" + a);
        StringBuilder builder = new StringBuilder(a);
        System.out.println("修改后字符串：" + builder.reverse().toString());
    }
}
