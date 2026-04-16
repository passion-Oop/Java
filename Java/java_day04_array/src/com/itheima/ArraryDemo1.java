package com.itheima;

public class ArraryDemo1 {
    public static void main(String[] args) {
        // 目标:了解静态数组的定义,输出和访问;
        randomDemo();

    }
    public static void randomDemo(){
        //随机生成12个不同的学生名字
        String[] names = new String[] { "小王", "小李", "小张", "小赵", "小孙", "小周", "小吴", "小王",
                        "小王", "小王", "小王", "小王"};
        int index = (int)(Math.random() * names.length);
        String name = names[index];
        System.out.println(name);
    }
}
