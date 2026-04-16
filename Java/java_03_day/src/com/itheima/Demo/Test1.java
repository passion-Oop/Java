package com.itheima.Demo;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        guess();

    }
    public static void guess(){
        // 生成随机数, 1-100之间
        // (int)Math.random() * 100 ==> [0 ,100)的整数 => [0-99] + 1 => [1-100]
        // int number = (int)(Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        // 定义一个死循环让用户输入数字, 直到猜对为止
        while (true) {
            System.out.println("请输入数字:");
            int input = sc.nextInt();
            if (input == number){
                System.out.println("恭喜你猜对了");
                break;

            } else if (input > number) {
                System.out.println("你输入的数字太大了");
            } else {
                System.out.println("你输入的数字太小了");
            }



            }
        }
    }

