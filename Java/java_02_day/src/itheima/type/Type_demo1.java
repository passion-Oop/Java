package itheima.type;

public class Type_demo1 {

    public static void main(String[] args) {
    //认识自动类型转换,强制自动类型转换.
        byte a = 12;
        print(a); //自动类型转换
        int b = 1;
        byte c = (byte)b;
        System.out.println(c);
    }

    public static void print(int a){
        //i的数据大小没有超出byte的范围,不会发生越界,所以保持原始值输出.
        System.out.println(a);
        int i = 20;
        byte j = (byte)i;
        System.out.println(j);
        System.out.println(".....................");

        int m = 1500;
        byte n = (byte) m;
        System.out.println(n);
        System.out.println(".....................");
        //出现了数据溢出的情况
        double k = 3.14;
        int l = (int) k;//浮点型转换成整型只保留整数部分.
        System.out.println(l);
        System.out.println("######################");
    }
}
