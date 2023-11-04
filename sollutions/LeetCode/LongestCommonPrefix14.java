public class LongestCommonPrefix14 {
    /*
     * Write a function to find the longest common prefix string amongst an array of
     * strings.
     * 
     * If there is no common prefix, return an empty string "".
     * 
     * 
     * 
     * Example 1:
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * 
     * Example 2:
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     */
    public static void main(String[] args) {
        String[] Data = {"flower","flow","flight"};
        System.out.println(LongestCommonPrefix14.commonPrefix(Data));
        //System.out.println(Data[3].length());
    }
    public static String commonPrefix(String[] strs){
        String ans=strs[0];
        for(byte i=0; i<strs.length; i++){
            if(strs[i].length()<ans.length() && strs[i].length()!=0){
                ans=ans.substring(0,strs[i].length());
            }
            else if(strs[i].length()==0){
                ans="";
            }
            for(byte j=0; j<Math.min(strs[i].length(), ans.length()); j++){
                if(strs[i].charAt(j)!=ans.charAt(j)){
                    ans=ans.substring(0,j);
                }
            }
        }

        return ans;
    }
}
