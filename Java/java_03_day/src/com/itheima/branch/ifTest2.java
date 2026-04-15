package com.itheima.branch;
import java.util.Scanner;

public class ifTest2 {
    //目标:完成自动驾驶程序的书写
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入红绿灯颜色:");
        String color = sc.next();
        test(color);
        sc.close();
        }

        //车辆摄像头检测到了红绿黄三种形态信息如下:
        public static void test(String color) {

            boolean red = false;
            boolean yellow = false;
            boolean green = false;
            if (color.equals("red")) {
                System.out.println("车辆停止");

            } else if (color.equals("yellow")) {
                System.out.println("车辆开始行进");

            } else if (color.equals("green")) {
                System.out.println("车辆开始行进");

            } else {
                System.out.println("请输入正确的颜色");
            }

        }
    }

