package com.itheima.branch;
import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
        //主要掌握分支结构的用法,首先有个输入输出单元
        //程序结束之后记得释放输入单元

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        main1(age);
        
        System.out.println("............................\n");

        System.out.println("请输入成绩:");
        double score = sc.nextDouble();
        main2(score);
        sc.close();

    }
    public static void main1(int age) {
        //if的使用
        if(age >= 18){
            System.out.println("可以投票");
        }
        else System.out.println("不可以投票");

    }
    //else if(条件){执行语句}的使用
    //学校根据学生考试分数确定学生的等级
    public static void main2(double score) {
        if(score >= 90){
            System.out.println("优秀");
        }
        else if(score >= 80){
            System.out.println("良好");
        }
        else if(score >= 70){
            System.out.println("及格");
        }
        else if(score <= 60) {
            System.out.println("不及格");
        }
        else{
            System.out.println("输入错误");

        }
    }
}
