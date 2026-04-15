package itheima.method;

public class Method_demo3 {

    public static void main(String[] args) {
        //在无返回值的方法中单独使用return; :提前结束方法
        num(2,3);
    }

    public static void num(int a, int b){

        if(b == 0){
            System.out.println("输入错误");
            return;
        }
        System.out.println(a / b);
    }
}
