package com.itheima.branch;
import java.util.Scanner;
public class switchDemo4 {
    public static void main(String[] args) {
        //目标:switch的穿透性
        //switch的穿透性:switch的case分支之间是默认的穿透关系
        //switch没有使用 break.
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int number = sc.nextInt();
        double number1 = sc.nextDouble();
        switch (number) {
            case 1:
                System.out.println("星期一");
            case 2:
                System.out.println("星期二");
            case 3:
                System.out.println("星期三");
            case 4:
                System.out.println("星期四");
            case 5:
                System.out.println("星期五");
            case 6:
                System.out.println("星期六");
            case 7:
                System.out.println("星期日");
                break;
                default:
                System.out.println("没有这个星期");

        }
        System.out.println("程序结束");

        System.out.println("........................................................");

        //有break 的穿透性
        switch (number) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
                case 7:
                System.out.println("星期日");
                break;
                default:
                System.out.println("没有这个星期");
                    //输入:8
                    //输出:没有这个星期
                    //输入:6
                    //输出:星期六

        }
        //在switch 中,传入的参数类型只能是byte,short,char,int,String
        //在jdk7中,switch的参数类型可以是枚举
        //double, float, long, boolean类型的数据不允许传入.
        //举例 :
        /* switch (number1) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("没有这个星期");

        }
                */

    }
}
