public class b3 implements A,B{
    public static void main(String[] args) {
        b3 d = new b3();
        d.print(); // Ambiguity: Which 'print' method should be called?
    }
    public void print(){
        B.super.print();
    }
}

interface A {
    default void print() {
        System.out.println("A");

    }
}
interface B {
    default void print() {
        System.out.println("B");
    }
}

