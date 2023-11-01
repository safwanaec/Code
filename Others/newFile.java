package Others;

import java.util.Scanner;

public class newFile {
    public static void main(String[] args) {
        final Double PI = 3.14159;

        Scanner inp = new Scanner(System.in);
        Double radius = inp.nextDouble();

        System.out.printf("A=%.4f%n",PI*Math.pow(radius, 2));

        inp.close();
    }
}
