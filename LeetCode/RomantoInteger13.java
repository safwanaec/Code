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
    public static short romanToInt(String s){
        short ans=0;
		/*
		I   =1
		IV	=4
		V	=5
		IX	=9
		X	=10
		XL	=40
		L	=50
		XC	=90
		C	=100
		CD	=400
		D	=500
		CM	=900
		M	=1000
		*/
		for(byte i=(byte) (s.length()-1); i>=0;i--){
		if(i>0 && s.charAt(i)=='V'&& s.charAt(i-1)=='I'){
				ans-=2;
			}
		else if(i>0 && s.charAt(i)=='X'&& s.charAt(i-1)=='I'){
				ans-=2;
			}
		else if(i>0 && s.charAt(i)=='L'&& s.charAt(i-1)=='X'){
				ans-=20;
			}
		else if(i>0 && s.charAt(i)=='C'&& s.charAt(i-1)=='X'){
				ans-=20;
			}
		else if(i>0 && s.charAt(i)=='D'&& s.charAt(i-1)=='C'){
				ans-=200;
			}
		else if(i>0 && s.charAt(i)=='M'&& s.charAt(i-1)=='C'){
				ans-=200;
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
				case 'L':
					ans+=50;
					break;
				case 'C':
					ans+=100;
					break;
				case 'D':
					ans+=500;
					break;
				case 'M':
					ans+=1000;
					break;
				default:
				}
		}
		
		return ans;
    }
}
