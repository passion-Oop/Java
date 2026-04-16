package com.itheima.Demo;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入寻找范围");
        int n = sc.nextInt();
        main1(n);
    }
    public static void main1(int n){
        if (n < 2) return;
       for (int i = 2; i <= n; i++) {
           boolean flag = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
            }
        }
    }
}
