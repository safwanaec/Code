import java.util.Scanner;

public class gold {
    public static void main(String[] args) {
        //System.out.print("\nEnter 24 Caret gold price: ");
        Scanner inp = new Scanner(System.in);
        int gold24=94500;//inp.nextInt();
        System.out.print("\nEnter Caret of the given Gold: ");
        Double goldCaret=inp.nextDouble();
        double weight;
        System.out.print("\nChose Unit" +"\n\n\t1.Roti\t\t\t2.Gram\n\n"+"Choice:");
        if(inp.nextInt()==1){
            System.out.print("\nEnter the weight of given Gold in Roti: ");
            weight=inp.nextDouble();
        }
        else{
            System.out.print("\nEnter the weight of given Gold in Gram: ");
            double vori = inp.nextDouble()/11.66;
            weight=((vori*96)-(int)(vori*96))+(6*(int)(vori*96));
        }
        double price = (((gold24/24)*goldCaret)/96.0)*weight;
        System.out.println("\nPrice: "+price);
        inp.close();
    }
}
