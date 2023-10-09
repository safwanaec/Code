public class a24923 {
    public static void main(String[] args) {
        for(int i=0; i<6; i++){
            for(int j=0; j<5; j++){
                if(j==i){
                    System.out.print("* ");
                }
           // System.out.println(" ");  
                if(i!=j)
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
        
        /*for(int i=0; i<9; i++){
            for(int j=0; j<5; j++){
                if(j==0||(i==4&&j==1)){
                    System.out.print("* ");
                }
                /*if((i>=0&&i<4)&&j==4-i){
                    System.out.print("* ");
                }
                if((i>4&&i<9)&&j==i-4){
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }*/
    }
}
