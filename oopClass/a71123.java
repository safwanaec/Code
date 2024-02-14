class test{
    private int a;
    public void setter(int x){
        this.a=x;
    }
    int getter(){
        return this.a;
    }
}

public class a71123 {
    
    public static void main(String[] args) {
        test s = new test();
        s.setter(6);
        System.out.println(s.getter());
    }

    
}