//package teach;

public class binaryOperation {
    public static void main(String[] args) {
        convertion con = new convertion(2);
        convertion conbin = new convertion(2);
        convertion condec = new convertion(10);
        System.out.println(con.toDecimal("110110101011010010101.10101101010"));
        //System.out.println(con.toBinary("76.7"));
        
        System.out.println(condec.toBinary(
                Double.toString(
                        conbin.toDecimal("1101") 
                      + conbin.toDecimal("1001"))));

        System.out.println(condec.toBinary(
                Double.toString(
                        conbin.toDecimal("1101") 
                      - conbin.toDecimal("1001"))));
        
        System.out.println(condec.toBinary(
                Double.toString(
                        conbin.toDecimal("1101") 
                      * conbin.toDecimal("1001"))));
        
        System.out.println(condec.toBinary(
                Double.toString(
                        conbin.toDecimal("1101") 
                      / conbin.toDecimal("1001"))));

        System.out.println(condec.toBinary(
                Integer.toString(
                        (int)conbin.toDecimal("1101") 
                      | (int)conbin.toDecimal("1001"))));

        System.out.println(condec.toBinary(
                Integer.toString(
                        (int)conbin.toDecimal("1101") 
                      & (int)conbin.toDecimal("1001"))));

        System.out.println(condec.toBinary(
                Integer.toString(
                       ~(int)conbin.toDecimal("1101"))));
    }

}

class convertion {
    private int base;

    convertion(int base) {
        this.base = base;
    }

    public String toBinary(String input) {
        String ans = ".";
        String binary1="";
        String binary2="";
        if (base == 2) {
            return input;
        }

        convertion con = new convertion(this.base);
        double decimal = con.toDecimal(input);

        int part1 = (int)decimal;
        double part2 = decimal-(int)decimal;
        while(part1!=0){
            if(part1%2==0){
                binary1+="0";
            }
            else binary1+="1";
            part1/=2;
        }
        binary1=flipString(binary1);
        if(part2==0.0){
            return binary1;
        }
        int counter = 0;
        while(part2!=0.0){
            part2*=2;
            if(part2 > 1){
                binary2+="1";
                part2-=1;
            }
            else binary2+="0";
            counter++;
            if(counter>10){
                break;
            }
        }
        ans = binary1+ans+binary2;
        return ans;
    }

    public double toDecimal(String input) {
        double decimal = 0;
        double decimal1 = 0;
        int start = input.indexOf(".");
        if (start != -1) {
            for (int i = start - 1; i >= 0; i--) {
                int pow = start - 1 - i;
                if (input.charAt(i) < 58 && input.charAt(i) > 47) {
                    decimal += (double) ((input.charAt(i) - 48) * Math.pow(base, pow));
                } 
                else if (input.charAt(i) < 71 && input.charAt(i) > 64) {
                    decimal += (double) ((input.charAt(i) - 55) * Math.pow(base, pow));
                }
                else if (input.charAt(i) < 103 && input.charAt(i) > 96) {
                    decimal1 += (double) ((input.charAt(i) - 87) * Math.pow(base, pow));
                }

            }
            for (int i = start + 1; i < input.length(); i++) {
                int pow = i - start;
                if (input.charAt(i) < 58 && input.charAt(i) > 47) {
                    decimal1 += (double) ((input.charAt(i) - 48) * Math.pow(base, -pow));
                } 
                else if (input.charAt(i) < 71 && input.charAt(i) > 64) {
                    decimal1 += (double) ((input.charAt(i) - 55) * Math.pow(base, -pow));
                }
                else if (input.charAt(i) < 103 && input.charAt(i) > 96) {
                    decimal1 += (double) ((input.charAt(i) - 87) * Math.pow(base, -pow));
                }
            }
        } 
        else {
            for (int i = input.length() - 1; i >= 0; i--) {
                int pow = input.length() - i - 1;
                if (input.charAt(i) < 58 && input.charAt(i) > 47) {
                    decimal += (double) ((input.charAt(i) - 48) * Math.pow(base, pow));
                } else if (input.charAt(i) < 71 && input.charAt(i) > 64) {
                    decimal += (double) ((input.charAt(i) - 55) * Math.pow(base, pow));
                }
                else if (input.charAt(i) < 103 && input.charAt(i) > 96) {
                    decimal1 += (double) ((input.charAt(i) - 87) * Math.pow(base, pow));
                }
            }
        }
        decimal += decimal1;
        return decimal;
    }

    private static String flipString(String input){
        char[] out = new char[input.length()];
        for(int i=0; i<input.length(); i++){
            out[input.length()-1-i]=input.charAt(i);
        }
        String output = new String(out);
        return output;
    }
}
