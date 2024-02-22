import javax.swing.JButton;
import javax.swing.JFrame;

public class c7 {
    public static void main(String[] args) {

        JFrame x = new JFrame();

        JButton a = new JButton("ok");
        JButton b = new JButton("submit");
        JButton c = new JButton("cancel");
        
        x.setSize(500, 500);
        x.add(a); 
        x.add(b);
        x.add(c);
    }

}