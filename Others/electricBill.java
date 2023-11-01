package Others;

import java.util.Scanner;

public class electricBill {
    long consumerNo;
    String consumerName;
    double previousMonthReading;
    double currentMonthReading;
    public double EBdomestic(double previousMonthReading,double currentMonthReading){
        double unit = currentMonthReading-previousMonthReading;
        double price =0;
        if(unit>100){
            double newUnit= unit-100;
            price=price+100;
            if(unit>200){
                price=price+(100*2.5);
                newUnit=newUnit-100;
                if(unit>500){
                    price=price+(300*4);
                    newUnit=newUnit-300;
                    price=price+(newUnit*6);
                }
                else{
                price=price+(newUnit*4);
                }
            }
            else{
                price=price+(newUnit*2.5);
            }
        }
        else{
            price=unit;
        }
        return price;
    }
    public double EBcommercial(double previousMonthReading,double currentMonthReading){
        double unit = currentMonthReading-previousMonthReading;
        double price =0;
        if(unit>100){
            double newUnit= unit-100;
            price=price+(100*2);
            if(unit>200){
                price=price+(100*4.5);
                newUnit=newUnit-100;
                if(unit>500){
                    price=price+(300*6);
                    newUnit=newUnit-300;
                    price=price+(newUnit*7);
                }
                else{
                price=price+(newUnit*6);
                }
            }
            else{
                price=price+(newUnit*4.5);
            }
        }
        else{
            price=unit*2;
        }
        return price;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        electricBill Bill1 = new electricBill();
        System.out.println("Choose Connection type\n\n1.Domestic\n2.Commercial");
        int choice = inp.nextInt();
        if(choice==1){
            //System.out.println("Enter name:");
            //Bill1.consumerName=inp.nextLine();
            System.out.println("Enter consumer number:");
            Bill1.consumerNo=inp.nextLong();
            System.out.println("Enter previous Month Reading and current Month Reading Respectively:");
            System.out.println(Bill1.EBdomestic(inp.nextDouble(), inp.nextDouble()));
        }
        else if(choice==2){
            //System.out.println("Enter name:");
            //Bill1.consumerName=inp.nextLine();
            System.out.println("Enter consumer number:");
            Bill1.consumerNo=inp.nextLong();
            System.out.println("Enter previous Month Reading and current Month Reading Respectively:");
            System.out.println(Bill1.EBcommercial(inp.nextDouble(), inp.nextDouble()));
        }
        else System.out.println("Choice Error");
        inp.close();
    }
}
