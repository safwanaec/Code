import java.util.Scanner;

public class classTest1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        classTest1 i = new classTest1();
        System.out.println(i.cube(inp.nextLong()));
        System.out.println("Enter number of lines:");
        i.pattern(inp.nextInt());
    }
    public long cube(long x){
        return x*x*x;
    }
    public void pattern(int lineNumber){
        for(int i = 0; i<=(lineNumber/2); i++){
            for(int j =(lineNumber/2)-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j =i+1; j>1; j--){
                System.out.print(j);
            }
            for(int j =1; j<=i+1; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        for(int i = (lineNumber/2); i>0; i--){
            for(int j =0; j<=(lineNumber/2)-i; j++){
                System.out.print(" ");
            }
            for(int j =i; j>1; j--){
                System.out.print(j);
            }
            for(int j =1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}

