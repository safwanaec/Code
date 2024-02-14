import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //File x=new File("D:/safwan.txt");
        example l =new example();
        
        try{
            FileReader reader = new FileReader(""); 
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        /*try{
            if(x.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }*/
        
    }
    protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }   

}
class example{

}

