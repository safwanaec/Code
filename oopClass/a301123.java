import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class a301123 {
    public static void main(String[] args) {
        File f = new File("E:\\src\\safwan\\");
        f.mkdir();
        File f1 = new File("E:\\src\\safwan\\july.txt");
        File f2 = new File("E:\\src\\safwan\\june.txt");
        File f3 = new File("E:\\src\\safwan\\david.txt");

        File f4 = new File("E:\\src\\safwan\\Class.txt");

        String [] names= {"a","b","c","d","e"};
        int[] roll= {2,3,4,5,6};
        
        try{
            f1.createNewFile();
            f2.createNewFile();

            f4.createNewFile();

            Formatter w4 = new Formatter("E:\\src\\safwan\\Class.txt");
            Formatter w1 = new Formatter("E:\\src\\safwan\\july.txt");
            Formatter w2 = new Formatter("E:\\src\\safwan\\june.txt");
            long n =10;
            String name = "Safwan!!";
            long count=10;
            for(long i=0; i<n; i++){
                w1.format("%s %d \n", name,count);
                w2.format("%s %d \n", name,count);
                count--;
            }
            w1.close();
            w2.close();

            Scanner inp = new Scanner(f1);
            while(inp.hasNext()){
                String line = inp.next();
                int x = inp.nextInt();
                System.out.println(line + x);
            }

            Scanner inp4 = new Scanner(f4);

            w4.format(" Name \t\t Roll \n\r");
            w4.format("------\t\t------\n\r");
            for(int i=0; i<5; i++){
                w4.format(" %s %d \n", names[i],roll[i]);
            }
            //System.out.println("File Created");
            w4.close();
            f3.delete();
        }
        catch(Exception e){
            System.out.println(e);
        }

        if(f3.exists()){
            //System.out.println("Exists");
        }
        else{
            //System.out.println("Dosen't exist");
        }
        //System.out.println(f1.getName()+" Exists");
    }    
}
