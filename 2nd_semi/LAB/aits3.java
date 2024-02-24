import java.util.Scanner;

public class aits3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        printPrime1(x);
        inp.close();
    }

    static void printPrime1(int n){
        while(n>1){
            if(isPrime(n)){
                System.out.print(n+" ");
            }
            n--;
        }
        
    }
    static boolean isPrime(long n){
        if(n==2 || n==3 || n==5 || n==2 || n==7){
            return true;
        }
        else if(n%7!=0 && n%5!=0 && n%3!=0 && n%2!=0){
            for(int i=(int)Math.sqrt(n); i>10; i--){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
        else return false;
    }

    /*static void printPrime(int n) {
        boolean isPrime;

        while (n > 1) {

            isPrime = false;

            if(n==2){
                System.out.printf("%d",n);
            }
            for (int i = n - 1; i > 1; i--) {

                if (n % i != 0) 
                {
                    isPrime = true;
                } 
                else 
                {
                    isPrime = false;
                    break;
                }

                if (isPrime && i == 2) 
                {
                    System.out.printf(n + " ");
                } 
                
            }

            n--;
        }

    }*/
}
