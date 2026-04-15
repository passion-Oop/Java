package itheima.operator;

public class operatorDemo1 {
    public static void main(String[] args) {
        printf2();
    }

    public static void printf(int a, int b){

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println((double) a / b);//强制类型转换,输出类型变为小数.
        System.out.println(a * 1.0 / b);
        System.out.println(a % b);
    }

    public static void printf2(){

        int a = 5;
        System.out.println("abc" + a);
        System.out.println(a + 5);// -> 10
        System.out.println("itheima" + a + 'a');// -> itheima5a

    }

}
