package itheima.scanner;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

    printUserInfo();
    }
    public static void printUserInfo(){
        //2. 创建对象(得到一个Scanner扫描器对象)
        Scanner sca = new Scanner(System.in);

        //3.获取用户输入
        System.out.println("请输入用户名:");
        String username = sca.next();
        //让程序在这一行暂停,等到用户输入一个字符串名称,
        //直到按了回车键之后,把名字交给username
        System.out.println("您叫:" + username);


        System.out.println("请输入年龄:");
        int age = sca.nextInt();
        System.out.println("您多少岁:" + age);
        //让程序在这一行暂停,等到用户输入一个整型数,
        //直到按了回车键之后,把年龄交给age
        sca.close();
    }

    }


