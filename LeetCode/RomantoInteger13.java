package LeetCode;

public class RomantoInteger13 {
    
    public static void main(String[] args) {
        System.out.println(RomantoInteger13.romanToInt("VIII"));
        String S = "Safwan";
        System.out.println(S.charAt(0)+""+S.length());
        if(S.charAt(0)=='S'){
            System.out.println("yooo");
        }
        else System.out.println("mnooo");
        
    }
    public static int romanToInt(String s){
        int ans=0;
		/*
		I   =1
		IV	=4
		V	 =5
		IX	=9
		X	 =10
		IF	=40
		F	 =50
		IH	=90
		H	 =100
		IG	=400
		G	 =500
		IT	=900
		T	 =1000
		*/
		for(int i=(s.length()-1); i>=0;i--){
		if(i>0 && s.charAt(i)=='V'&& s.charAt(i-1)=='I'){
				ans-=2;
			}
		else if(i>0 && s.charAt(i)=='X'&& s.charAt(i-1)=='I'){
				ans-=2;
			}
		else if(i>0 && s.charAt(i)=='F'&& s.charAt(i-1)=='I'){
				ans-=11;
			}
		else if(i>0 && s.charAt(i)=='H'&& s.charAt(i-1)=='I'){
				ans-=11;
			}
		else if(i>0 && s.charAt(i)=='G'&& s.charAt(i-1)=='I'){
				ans-=101;
			}
		else if(i>0 && s.charAt(i)=='T'&& s.charAt(i-1)=='I'){
				ans-=101;
			}
		switch (s.charAt(i)){
				case 'I':
					ans+=1;
					break;
				case 'V':
					ans+=5;
					break;
				case 'X':
					ans+=10;
					break;
				case 'F':
					ans+=50;
					break;
				case 'H':
					ans+=100;
					break;
				case 'G':
					ans+=500;
					break;
				case 'T':
					ans+=1000;
					break;
				default:
				}
		}
		
		return ans;

    }
}
