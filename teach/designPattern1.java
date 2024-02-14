public class designPattern1 {
    public static void main(String[] args){
        singleton i = singleton.getobj();
        i.dog();
        i.x=9;
        System.out.println(i.x);


        singleton j = singleton.getobj();
        System.out.println(j.x);
        j.dog();
    }
    
}
