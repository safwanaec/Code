import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 {
    public static void main(String[] args) {

        
        // jframe object
        JFrame x= new JFrame();

        // 3button, 3 object of JButton
        JButton a = new JButton();
        JButton b = new JButton();
        JButton c = new JButton();

        // setting up the frame
        x.setSize(500, 500);                // frame size
        x.setVisible(true);                           // frame visibility
        x.setLayout(null);                     // Layout for buttons. without this, the buttons would not be aranged properly

        a.setBounds(50, 20, 50, 50);   // Setting size and position of the button
        a.setText("ok");                          // Text to be displayed in the button

        b.setBounds(50, 70, 50, 50);
        b.setText("submit");

        c.setBounds(50, 120, 100, 50);
        c.setText("cancel");

        x.add(a);                                        // Adding the buttons to the scene to be displayed
        x.add(b);
        x.add(c);
    }

}