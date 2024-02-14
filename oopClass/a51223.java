public class a51223 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.fun();
    }
}
class Outer{
    String s="Safwan";
    private int a=99;
    void fun(){
        System.out.println(a);
    }
    class inner1 extends Outer{
        void fun(){
            System.out.println(s+a);
        }
    }
}
