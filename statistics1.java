import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class statistics1 {
    public static void main(String[] args) {
        System.out.println("How many numbers will you enter?");
        Scanner inp = new Scanner(System.in);
        final int amountOfData = inp.nextInt();

        int[] Data = new int[amountOfData];
        System.out.println("Start entering the Data(integer):");

        for(int i=0; i<amountOfData; i++){
            Data[i]=inp.nextInt();
        }

        Arrays.sort(Data);
        int max=Data[amountOfData-1],min=Data[0];

        DecimalFormat df = new DecimalFormat("#.#######");
        df.setRoundingMode(RoundingMode.HALF_EVEN);

        double arithmaticMean,temp=0.0;
        for(int i:Data){
            temp+=i;
        }
        arithmaticMean=Double.parseDouble(df.format(temp/amountOfData));


        double geometricMean;
        temp=1;
        for(int i:Data){
            temp*=i;
        }
        
        geometricMean = Double.parseDouble(df.format(Math.pow(temp, 1.0/amountOfData))) ;

        double harmonicMean;
        temp=0;
        for(int i:Data){
            temp+=1.0/i;
        }
        harmonicMean=Double.parseDouble(df.format(amountOfData/temp));
        System.out.println("max = "+max+"\nmin = "+min);
        System.out.println("AM = "+arithmaticMean+"\nGM = "+geometricMean+"\nHM = "+harmonicMean);

        double classInterval = Data[amountOfData-1]-Data[0];

        if(classInterval%2!=0){
            classInterval+=1;
        }

        classInterval = ((classInterval/25)+(classInterval/5))/2;

        DecimalFormat smallFormat = new DecimalFormat("#.##");
        smallFormat.setRoundingMode(RoundingMode.HALF_EVEN);
        classInterval =Double.parseDouble(smallFormat.format(classInterval));

        if(classInterval>(int)classInterval){
            classInterval=(int)classInterval+0.5;
        }
        else classInterval=(int)classInterval-0.5;

        if(classInterval<2){
            classInterval+=3;
        }

        System.out.println("class Interval = "+classInterval);


        double start = (min-(min%5));
        if(start==0.0){
            start+=1;
        }
        double end= max+(max%5)-0.5;

        if(end<max){
            while(((end-start)/classInterval)%1!=0){
            end+=1;
        }
        }
        else if(end>max){
            while(((end-start)/classInterval)%1!=0){
            end-=1;
        }
        }
        
        double classAmount = (end-start)/classInterval;
        System.out.println("Start = "+(start)+"\nEnd = "+end+"\nClass Amount = "+(int)classAmount);

        System.out.println("\n\n|     Class\t|     Member count\t|\tMembers\t\n");

        double classRange=start;
        int classMemberCount;
        for(int i = (int)classAmount; i>0; i--){
            classMemberCount=0;
            System.out.print("|   "+classRange+" - "+(classRange+classInterval)+"\t|");
            for(int j = 0; j<amountOfData; j++){
                if(Data[j]>=classRange && Data[j]<=(classRange+classInterval)){
                    classMemberCount++;
                }
            }
            System.out.print("\t   "+classMemberCount+"\t\t|    ");

            for(int j = 0; j<amountOfData; j++){
                if(Data[j]>=classRange && Data[j]<=(classRange+classInterval)){
                    System.out.print(Data[j]+" ");
                }
            }

            classRange+=classInterval;
            System.out.println("\n");

        }

        inp.close();
    }
}
