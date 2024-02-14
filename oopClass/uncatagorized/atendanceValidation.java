

public class atendanceValidation {
    static void Validation(int percentage) throws atendanceToLowException{
        if(percentage<75){
            throw new atendanceToLowException("\nYou are not qualified to participate in the exam!\n");
        }
        else{
            System.out.println("\nYou are qualified to participate in the exam!\n");
        }
    }
    public static void main(String[] args) {
        try{
            Validation(74);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
