import java.util.Scanner;

public class  a51123 extends template{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(add(2, 4));
        System.out.println(add(1, 5, 9));
        a51123 a = new a51123();
        System.out.println(a.subtract(7, 4));
        System.out.println(template.multiply(4, 5));
        System.out.println(template.multiply(5, 7 , 9));
        System.out.println(template.multiply(3.06, 5.67));
        System.out.println(new template().divition(6, 2));
        overReadExample();
        a.overReadExample2();
        a.overReadExample3();
        new template().overReadExample();
        new template().overReadExample2();
        new template().overReadExample3();
        
    }

    static int add(int a,int b){
        return a+b;
    }

    static int add(int a,int b,int c){
        return a+b+c;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    static void overReadExample(){
        System.out.println("safwan0");
    }
    public void overReadExample2(){
        System.out.println("safwan1");
    }
    void overReadExample3(){
        System.out.println("safwan2");
    }
}

class template{
    static void overReadExample(){
        System.out.println("hello world!0");
    }
    public void overReadExample2(){
        System.out.println("hello world!1");
    }
    void overReadExample3(){
        System.out.println("hello world!2");
    }
    static int multiply(int a, int b){
        return a*b;
    }
    static int multiply(int a, int b, int c){
        return a*b*c;
    }
    static double multiply(double a, double b){
        return a*b;
    }
    public float divition(int a, int b){
        return a/b;
    }
}
