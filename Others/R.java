public class R {
        int[] roll = {1,2,3};
        
        String[] name= {"a","b","c"};
        int[] mark = {10,20,30};
        public void input(int R, String S, int M)
        {
            /*int r;
            r = R;
            String Sname;
            Sname = S;
            int mark = M;*/
            System.out.println("Roll = "+R);
            System.out.println("Subject name: "+S);
            System.out.println("Subject mark: "+M);
            System.out.println("");
           
        }
        //public void avg(int m1,int m2,int m3)
        public void avg(int m[])
        {
            //double average = (m1+m2+m3)/3;
            //System.out.println("Average mark: "+average);

            /*System.out.println(m[0]);
            System.out.println(m[1]);
            System.out.println(m[2]);*/
            double average = (m[0]+m[1]+m[2])/3;
            System.out.println(average);
        }
        //public void name;
        
        public static void main(String[] args) {
            R obj = new R();
            obj.input(obj.roll[0], obj.name[0], obj.mark[0]);

            obj.input(obj.roll[1], obj.name[1], obj.mark[1]);

            obj.input(obj.roll[2], obj.name[2], obj.mark[2]);
            
            //obj1.avg(obj.mark[0],obj.mark[1],obj.mark[2]);
            obj.avg(obj.mark);                      
            //double avarage = (obj.mark[0]+obj.mark[1]+obj.mark[2])/3;
            
        }
    }
    



