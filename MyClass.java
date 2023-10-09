class MyClass {
   int num;
   String name;
   MyClass(int x,String n)
   {
      num = x;
      name = n;
   }
   public static void main(String args[]) {
      MyClass t1 = new MyClass( 10,"Tareq");
     
      System.out.println(t1.num + " " + t1.name);
   
   }
}