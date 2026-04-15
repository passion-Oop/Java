package itheima.scanner;
import java.util.Scanner;

public class ScannerDemo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高");

        double height = sc.nextDouble();

        System.out.println("请输入体重");
        double weight = sc.nextDouble();

        System.out.println("请输入年龄");
        int age = sc.nextInt();


        System.out.println("请输入性别");
        String sex = sc.next();


        System.out.println(BMI(height, weight));
        System.out.println(BMR(height, weight, age, sex));
        sc.close();
    }

    public static double BMI(double height, double weight) {

        return height / (weight * weight);
    }

    public static double BMR(double height, double weight, int age, String sex) {
        double bmr = 0;
        if ("男".equals(sex)) {

            bmr = 13.7526 * weight + 5.033 * height - 6.7550 * age + 66.473;


        } else {
            bmr = 9.5634 * weight + 1.8496 * height - 4.6756 * age + 665.0955;


        }
        return bmr;


    }
}
