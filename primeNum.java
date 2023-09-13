import java.util.Arrays;

public class primeNum {
    public static void main(String[] args) {
        //System.out.println("Enter a number: ");

        //Scanner inp = new Scanner(System.in);
        //int Range = inp.nextInt();
        int[] input = {9,8,7,6,5,4,3,2,1};

        Arrays.sort(input);
        //System.out.println(input.length);
        for(int i=0; i<= input.length-1; i++){
            int temp=0;
            for(int j=1; j<=input[i]; j++){
                if(input[i]%j==0){
                    temp++;
                }
            }
            if(temp==2){
                System.out.print(input[i]+" ");
            }
        }
        
        //inp.close();
    }
}
