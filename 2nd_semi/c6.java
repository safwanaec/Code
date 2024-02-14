import java.nio.file.Files;
import java.nio.file.Path;

public class c6 {
    public static void main(String[] args) {
        try{
            Path filepath1 = Path.of("D:/f1.txt");
            String f1=Files.readString(filepath1);

            Path filepath2 = Path.of("D:/f2.txt");
            String f2=Files.readString(filepath2);

            if(f1.compareTo(f2)==0){
                System.out.println("The files are lexicographically equal");
            }
            else{
                System.out.println("The files are not lexicographically equal");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
