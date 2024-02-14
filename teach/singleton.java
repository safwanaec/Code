import java.util.Scanner;

final class singleton {
    public int x=0;
    private static singleton object;

    private singleton(){

    }

    public static singleton getobj(){
        if(object==null){
            object = new singleton();
            return object;
        }
        else{
            return object;
        }
        
    }

    public void dog(){
        System.out.println("woof");
    }
    
}
