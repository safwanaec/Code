import java.util.Random;

class prc1{
    public static void main(String[] args) {
        Random rdm = new Random();
        int[] values = {1,2,3,4,5,6,7,8};
        int[] num = new int[values.length];
        int n = 9;
        for(int i=0; i<num.length; i++){
            num[i] = rdm.nextInt(n);
        }
        values = num;
        for(int i:values){
            System.out.print(i+" ");
        }

    }
}