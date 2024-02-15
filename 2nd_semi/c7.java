import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class c7 {
    public static void main(String[] args) {
        // jframe object
        JFrame x = new JFrame();
        // 3button, 3 object of JButton
        JButton a = new JButton("ok");
        JButton b = new JButton("submit");
        JButton c = new JButton("cancel");
        // setting up the frame
        x.setSize(500, 500); // frame size
        x.setVisible(true); // frame visibility
        x.setLayout(new FlowLayout()); // Layout for buttons. without this, the buttons would not be aranged properly
        x.add(a); // Adding the buttons to the scene to be displayed
        x.add(b);
        x.add(c);
    }

}