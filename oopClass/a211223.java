public class a211223 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");
        s.replace(1, 3, "Java");
        System.out.println(s);
        s.replace(0, 7, "Hello");
        s.insert(1, "Java");
        System.out.println(s);
        String st = "My name is karim";
        String str = st.substring(5,7);

        System.out.println(str);
        
    }
}
