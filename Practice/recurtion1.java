import java.util.Scanner;

public class recurtion1 {
    static int z=0;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x= inp.nextInt();
        int m=inp.nextInt();
        int n=inp.nextInt();
        printCons(x);
        System.out.println("");
        System.out.println(factorial(x));
        System.out.println(Nthfibonacci(x));
        printFibonacci(x);
        System.out.println("");
        System.out.println(sumToN(x));
        System.out.println(pathCount(m, n));
        System.out.println(partition(m, n));
    }

    static void printCons(int x){
        if(x==0){
            return;
        }
        System.out.print(x+" ");
        printCons(x-1);
    }

    static long factorial(int x){
        if(x==1){
            return 1;
        }
        return x*factorial(x-1);
    }

    static int Nthfibonacci(int x){
        if(x<2){
            if(x==0){
                return 1;
            }
            return Nthfibonacci(x-1);
        }
        return Nthfibonacci(x-1)+Nthfibonacci(x-2);
    }
    static void printFibonacci(int x){
        System.out.print(Nthfibonacci(z) + " ");
        z++;
        if(x>0){
            printFibonacci(x-1);
        }
        return;
    }

    static int sumToN(int n){
        if(n==0){
            return 0;
        }
        return sumToN(n-1) + n;
    }

    static int pathCount(int m, int n){
        if(m==1 || n==1){
            return 1;
        }
        else if(m<1 || n<1){
            return 0;
        }
        return pathCount(m-1, n) + pathCount(m, n-1);
    }

    static int partition(int m, int n){
        if(n==1 || m==1 || m==0){
            return 1;
        }
        else if(m<0 || n<1){
            return 0;
        }
        return partition(m,n-1)+partition(m-n, n);
    }
}
