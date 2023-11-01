package LeetCode;

public class ValidParentheses20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}([{]})"));
    }
    public static boolean isValid(String s) {
        boolean[]counter={true,true,true};
        char[] bracesOp ={'(','{','['};
        char[] bracesCl ={')','}',']'};
        //char lastOpenned;
        //char firstClosed;
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<3; j++){
                if(s.charAt(i)==bracesOp[j]){
                    //lastOpenned=s.charAt(i);
                }
                else if(s.charAt(i)==bracesCl[j]){
                    
                }
            }
        }
        if(counter[0]==true && counter[1]==true && counter[2]==true){
            return true;
        }
        else return false;
    }
}
