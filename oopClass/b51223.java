/*This program writes a string to a file and then reads the
strings back from the file. The string is then displayed
on the screen. */
// importing the libraries
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class b51223 {
    // create main method to execute the program
    public static void main(String[] args) throws IOException {
        // an object out of class BufferedWriter is // declared
        BufferedWriter out = null;
        try {
            // writing the file
            FileWriter fstream = new FileWriter("hello.txt");
            out = new BufferedWriter(fstream);
            out.write("Hello World!");
            System.out.println("\n Written to the file!!");
        }
        // in case the file does not open
        catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            if (out != null) {
                out.close();
            }
        }
        // now reading the file
        BufferedReader in = null;
        // it is an object class BufferdReader
        try {
            FileReader fstream = new FileReader("hello.txt");
            in = new BufferedReader(fstream);
            String filetext = in.readLine();
            System.out.println("\nReading data:- ");
            System.out.println(filetext);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}