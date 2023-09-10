import java.util.Scanner;

public class temp {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("\n\n\t1.Celcius\t2.Farenheit\nWhat do you want to enter?");
        byte i = inp.nextByte();
        float x;

        if(i==1){
            System.out.println("\nPlease enter the temperature in Celcius: ");
            x = inp.nextFloat();
            float y = (x*1.8F)+32;
            System.out.println("\nThe temperature in Farenheit is: \n" + y);
        }
        else if(i==2){
            System.out.println("\nPlease enter the temperature in Farenheit: ");
            x = inp.nextFloat();
            float y = (x-32)/1.8F;
            System.out.println("\nThe temperature in Celcius is: \n" + y);
        }
        else{
            System.out.println("\nWrong input!!");
        }
        
    }
    
}
