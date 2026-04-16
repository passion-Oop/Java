package com.itheima.loop_structure;
import java.util.Scanner;

public class forDemo1 {
    //用高精度算法计算加法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int n = sc.nextInt();
        n = add(n);
        System.out.println(n);

    }

    //用高精度算法计算加法
    public static int add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
