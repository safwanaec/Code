import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the amount of peoples ages you want to enter: ");
        int num = inp.nextInt();
        int[] age;
        age = new int[num];

        System.out.println("Enter the ages:");
        for(int i = 0; i<num; i++){
            age[i]=inp.nextInt();
        }

        int min = age[0];
        int max = age[0];

        for(int i=1; i<num; i++){
            if(min<age[i]){
                min = age[i];
            }
            if(max>age[i]){
                max = age[i];
            }
        }

        System.out.println("The smallest entered age is: "+min);
        System.out.println("The largest entered age is: "+max);

        inp.close();
    }
}
