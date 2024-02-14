import java.util.Scanner;

/**
 * class8
 */
public class class8 {

    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        /*System.out.println("To get the sum of numbers from x to y");
        System.out.print("Enter x: ");
        int x=inp.nextInt();
        System.out.print("Enter y: ");
        int y=inp.nextInt();
        System.out.println("The sum of numbers from "+x+" to "+y+" is "+sum(x, y));*/
        byte g=0;
        Land(100, g);
    }
    static int oddSum(int n){
        return n*n;
    }
    static int sum(int x, int y){
        return ((x+y)*(Math.abs(y-x)+1))/2;
    }
    static double inchToCm(double inch){
        return inch*2.54;
    }
    static double cmToInch(double cm){
        return cm*(1/2.54);
    }
    static double mileToKm(double mile){
        return mile*1.61;
    }
    static double kmTMile(double km){
        return km*0.61;
    }
    static double feetToMeter(double feet){
        return feet*0.3048;
    }
    static double meterToFeet(double meter){
        return meter*(1/0.308);
    }
    static void Land(double x, byte Unit){
        /*Unit
         * 0 = Sq. Meter
         * 1 = Sq. Feet
         * 2 = Sq. Inch
         * 3 = Sq. Mile
         * 4 = Sq. Kilometer
         * 5 = Acre
         * 6 = Hector
         * 7 = কাঠা
         * 8 = বিঘা
         * 9 = শতাংস
         * 10 = ছটাক
         * 11 = বর্গ গজ
         * 12 = কানি
         * 13 = গণ্ডা
         * 14 = বর্গ হাত
         */
        double[] ans = new double[15];
        
        double[] unit ={1,0.0929,0.00064516,2589988.11,1000000,4046.85642,10000,66.773,1335.4626,40.47,4.0125,1.19,1605,80.25,0.01253};
        String [] unitName = {"Sq. Meter","Sq. feet","Sq. Inch","Sq. Mile","Sq. Km","Acre","Hector","Katha","Bigha","Shotangsho","Chotak","Sq. Goj","Kani","Gonda","Sq. Haat"};
        /* 1 Sq. feet = 0.0929 Sq. meter
        * 1 Sq. Inch = 0.00064516 Sq. meter
        * 1 Sq. Mile = 2589988.11 Sq. meter
        * 1 Sq. Km = 1000000 Sq. meter
        * 1 Acre = 4046.85642 Sq. meter
        * 1 Hector = 10000 Sq. meter
        * 1 কাঠা = 66.7731309 Sq. meter
        * 1 বিঘা = 1335.462618 Sq. meter
        * 1 শতাংস = 40.46872104 Sq. meter
        * 1 ছটাক = 4.0125 Sq. meter
        * 1 বর্গ গজ = 1.19 Sq. meter
        * 1 কানি = 1605 Sq. meter
        * 1 গণ্ডা = 80.25 Sq. meter
        * 1 বর্গ হাত = 0.01253 Sq. meter
        */

        for(int i=0; i<15; i++){
            if(Unit==i){
                ans[0]=unit[i]*x;
                break;
            }
        }
        for(int i=1; i<15; i++){
            ans[i] = ans[0]/unit[i];
            System.out.println(x+" "+unitName[Unit]+" = "+ans[i-1]+" "+unitName[i-1]);
        }
        System.out.println(x+" "+unitName[Unit]+" = "+ans[14]+" "+unitName[14]);

        
    }
}