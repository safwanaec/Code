import java.util.Scanner;

public class wordCounter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String input = inp.nextLine();
        int count = 0;
        for(int i = 0; i<= input.length()-1; i++){
            count++;
        char charInString = input.toCharArray()[i];
            if(charInString == ' '){
                count--;
            }
        }

        System.out.println(count);
        inp.close();
    }
}
