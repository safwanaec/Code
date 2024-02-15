import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class b6 {
    public static void main(String[] args) {
        ByteStreamExample();
        CharacterStreamExample();
        StandardStreamsExample();
    }

    static void ByteStreamExample() {
        try {
            // Assuming we have a input.text file in the d drive with some text written on it, otherwise we have to make one
            // Reading from a file using FileInputStream (byte stream)
            FileInputStream inputStream = new FileInputStream("D:/input.txt");
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void CharacterStreamExample() {
        try {
            // Writing to a file using FileWriter (character stream)
            FileWriter writer = new FileWriter("D:/input.txt");
            writer.write("Hello, Character Streams!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void StandardStreamsExample() {
        // Reading from standard input (System.in)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        scanner.close();
        System.out.println("You entered: " + userInput);

        // Writing to standard input (System.out)
        System.out.println("Hello, Standard input!");
    }
}
