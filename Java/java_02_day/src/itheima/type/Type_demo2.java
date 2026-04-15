package itheima.type;

public class Type_demo2 {
    public static void main(String[] args) {
        //目标:理解表达式的自动类型提升.




    }
    //.需求:接收各种类型的数据运算
    public static double calc(int a, int b, double c, char d){

        return a+b+c+d;
    }
    public static byte calc3(byte a, byte b){

        //默认返回int类型. 如何解决? ->使用强转方法
        return (byte) (a + b);
    }
    public static int calc2(byte a, byte b){

        //默认返回int类型
        return (a + b);
    }
}




