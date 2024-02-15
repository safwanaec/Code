import java.nio.file.Files;
import java.nio.file.Path;

class NotAPilandromeException extends Exception {
    public NotAPilandromeException() {
    }
}

public class c5 {
    public static void main(String[] args) {
        try {
            Path filepath = Path.of("D:/input.txt");
            String number = Files.readString(filepath);
            for (int j = 0; j <= (number.length() / 2); j++) {
                if (number.charAt(j) != number.charAt(number.length() - j - 1)) {
                    throw new NotAPilandromeException();
                }
            }
            System.out.println("The given number is a pilendrome");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
