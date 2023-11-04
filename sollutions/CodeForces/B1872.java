import java.util.Scanner;

public class B1872 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int[] ans = new int[t];

        for (int i = 0; i < t; i++) {
            ans[i]=Integer.MAX_VALUE;
            int n = inp.nextInt();
            for (int j = 0; j < n; j++) {
                int[] trap = new int[n];
                int[] timer = new int[n];
                trap[j] = inp.nextInt();
                timer[j] = inp.nextInt();
                if (timer[j] % 2 == 0) {
                    if (ans[i] > (((timer[j] - 2) / 2) + trap[j])) {
                        ans[i] = ((timer[j] - 2) / 2) + trap[j];
                    }
                } else {
                    if (ans[i] > ((timer[j] - 1) / 2) + trap[j]) {
                        ans[i] = ((timer[j] - 1) / 2) + trap[j];
                    }
                }
            }
        }
        for(int i:ans){
            System.out.println(i);
        }
        inp.close();
    }
}
