import java.util.Scanner;

abstract class Name{
    abstract void name(String name);
}
public class b71123 extends Name {
    void name(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Name s = new b71123();
        s.name(inp.nextLine());
        inp.close();
    }
}