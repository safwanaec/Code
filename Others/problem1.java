import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int n = inp.nextInt();
        double a = Math.sqrt(n);
        int o=0;
        if(n>5){
            o=n/2;
        }
        else o=n;
        //System.out.println((int)a);
        for(int i=0; i<=(int)a; i++){
            for(int j=0; j<=(int)a; j++){
                //System.out.println("i="+i+"j="+j+" "+(Math.pow(i, j)*j)+" "+(Math.pow(j,i)*i));
                if((Math.pow(i, j)*j)+(Math.pow(j,i))*i==n){
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
        for(int i=0; i<=o; i++){
            for(int j=0; j<=o; j++){
                if((Math.pow(i, j)*j)+(Math.pow(j,i)*i)==n){
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
