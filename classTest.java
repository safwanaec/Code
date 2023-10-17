import java.text.NumberFormat;
import java.util.Scanner;

public class classTest{
    public static void main(String[] args) {
        /*
         * 16 October 2023
         * 1.A company decided to give bonus of 5% to employee if his/her year of
         * service is more than 5 years.
         * Ask user for their salary and year of service and print the net bonus amount.
         * 2.A student will not be allowed to sit in exam if his/her attendance is less
         * than 75%.
         * Take following input from user
         * Number of classes held
         * Number of classes attended.
         * And print
         * percentage of class attended
         * Is student is allowed to sit in exam or not.
         * 3. Write a difference between break and continue statement.
         * 4.A school have 10 student, display their name using for-each loop.
         * 
         */
        saleryBonus sb = new saleryBonus();
        sb.Bonus();
        attendance ad = new attendance();
        ad.classAttendance();
        int[] arr = new int[6];
    }
}

class saleryBonus{
    public void Bonus(){
        Scanner inp = new Scanner(System.in);
        NumberFormat change = NumberFormat.getCurrencyInstance();
        System.out.println("Enter your current salary ammont:");
        double salary = inp.nextDouble();
        System.out.println("Enter thr ammount of years you've working in this company for:");
        int time = inp.nextInt();
        double bonus = ((salary*5)/100);
        double salaryIncludingBonus = bonus+salary;
        if(time>5){
            System.out.println("Your salary including bonus is: "+change.format(salaryIncludingBonus));
        }
        else{
            System.out.println("Your salary is: "+change.format((salary)));
        }
        inp.close();
    }
}
class attendance{
    public void classAttendance(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of classes held: ");
        int classesHeld=inp.nextInt();
        System.out.println("Enter number of classes attended: ");
        int classesAtended = inp.nextInt();
        System.out.println("Percentage of class attended: "+((100*classesAtended)/classesHeld)+"%");
        if(((100*classesAtended)/classesHeld)>75){
            System.out.println("student is allowed to sit in exam!");
        }
        else{
            System.out.println("student is not allowed to sit in exam!");
        }
    }
}