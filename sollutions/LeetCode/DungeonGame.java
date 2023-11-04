public class DungeonGame {
    //Incomplete
    public static void main(String[] args) {
        int[][] a ={{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(calculateMinimumHP(a));
    }
    public static int calculateMinimumHP(int[][] dungeon) {
        int ans=0;
        int sumConsiNeg=Integer.MIN_VALUE;
        boolean consicuitive=false;
        for(int i=0; i<dungeon[0].length; i++){
            ans+=dungeon[0][i];
                
        }
        for(int i=1; i<dungeon.length; i++){
            ans+=dungeon[i][dungeon[0].length-1];
        }
        if(ans<0){
            ans = Math.abs(ans)+ans+1;
        }
        
        return ans;
    }
}
