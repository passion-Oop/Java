package com.itheima.loop_structure;

public class WhileDemo2 {
    public static void main(String[] args) {
        // 掌握使用 while 循环结构
        // 了解 for 循环和 while 循环应用场景的区别.
        // 假如你知道循环次数 -> for 循环, 假如不知道循环次数 -> while 循环.
        // 假如小明向银行存储了2w,银行的复存利率为2.7%,要多久小明的本金变为原来的一倍.
        double money = 20000;
        int year = 0;
        year = main1();
        System.out.println("第" + year + "年" );
    }
    public static int main1() {
        double money = 20000;
        double yearRate = 0.027;
        int year = 0;
        while (money <= 40000) {
            money = money * (1 + yearRate);
            year++;
        }

        return year;
    }
}
