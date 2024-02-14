import java.util.Scanner;

public class Result {
    int roll;
    String[] subName= new String[3];
    int[] mark = new int[3];
    public void input(int Roll, String Subject1, int Mark1,String Subject2, int Mark2,String Subject3, int Mark3 ){
        roll = Roll;
        this.subName[0]=Subject1;
        this.subName[1]=Subject2;
        this.subName[2]=Subject3;
        this.mark[0]=Mark1;
        this.mark[1]=Mark2;
        this.mark[2]=Mark3;
    }
    public void show(){
        System.out.println("Roll:"+this.roll);
        for(int i=0; i<3; i++){
            System.out.println("Subject "+(i+1)+": "+this.subName[i]+"\nMark: "+this.mark[i]);
        }
    }
    public int total(){
        return this.mark[0]+this.mark[1]+this.mark[2];
    }
    public double avg(){
        return (this.mark[0]+this.mark[1]+this.mark[2])/3;
    }
    public static void main(String[] args) {
        Result i = new Result();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Roll number");
        int roll = inp.nextInt();
        inp.nextLine();
        String[] subname = new String[3];
        int[] mark = new int[3];
        for(int j=0; j<3; j++){
            
            System.out.println("Enter Subject name: ");
            subname[j]=inp.nextLine();
            System.out.println("Enter Marks: ");
            mark[j]= Integer.parseInt(inp.nextLine());
            
        }
        i.input(roll,subname[0],mark[0], subname[1], mark[1], subname[2], mark[2]);
        i.show();
        System.out.println("total: "+i.total());
        System.out.println("avarage: "+i.avg());
        inp.close();
    }
}
