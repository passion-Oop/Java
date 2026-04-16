package com.itheima.Demo;
import java.util.Scanner;
import java.util.Random;
public class Test2 {
    public static void main(String[] args) {
        // 目标: 开发验证码
        // 1. 调用一个方法返回执行位数的验证码, 每位只能是数字或者大写字母或者小写字母
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码位数:");
        int n = sc.nextInt();
        String code = getCode(n);
        System.out.println(code + "\n");
        Random ra = new Random();
        int a = ra.nextInt(4);
        System.out.println(a);
    }
    public static String getCode(int n) {
        String code = "";
        for (int i = 0; i < n; i++){

            int type = (int)(Math.random() * 3);
            if (type == 0){
                int num = (int)(Math.random() * 10);
                code += num;
            }
            if (type == 1){
                int num1 = (int)(Math.random() * 26);
                char ch = (char)('a' + num1);
                code += ch;
            }
            if (type == 2){
                int num2 = (int)(Math.random() * 26);
                char ch1 = (char)('A' + num2);
                code += ch1;
            }

        }
        return code;

    }


}
