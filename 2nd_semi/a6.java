import java.io.FileInputStream;
import java.io.IOException;

public class a6 {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("D:/input.txt");
            // Read bytes from the file
            int byteValue;
            while ((byteValue = fileInputStream.read()) != -1) {
                
                System.out.print((char) byteValue);
            }
            fileInputStream.close();
        } catch (IOException e) {
            // Handle potential IOExceptions, such as file not found or unable to read
            e.printStackTrace();
        }
    }
}
