package com.itheima.branch;
import java.util.Scanner;
public class switchDemo3 {
    public static void main(String[] args) {
        //了解 switch 的语法结构
        //根据男女性别不同推荐书籍
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入性别:");
        String gender = sc.next();
        switch (gender) {
            case "男":
                System.out.println("推荐《java从入门到放弃》");
                break;
            case "女":
                System.out.println("推荐《java从入门到放弃》");
                break;
            default:
                System.out.println("请输入正确的性别");
        }
    }

}
