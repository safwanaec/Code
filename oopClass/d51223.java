
// importing Java AWT class  
import java.awt.*;

// extending Frame class to our class AWTExample1  
public class d51223 extends Frame {

    // initializing using constructor
    void AWTExample1() {

        // creating a button
        Button b = new Button("Click Me!!");

        // setting button position on screen
        b.setBounds(30, 100, 80, 30);

        // adding button into frame
        add(b);

        Button c = new Button("Safwan!!");
        c.setBounds(130,100,80,30);
        add(c);

        Button d = new Button("WIN!");
        d.setBounds(230,100,30,30);
        add(d);

        Button a = new Button("Bombom!");
        a.setBounds(30,50,80,30);
        add(a);
        Button e = new Button("Bombom!");
        e.setBounds(30,150,80,30);
        add(e);

        // frame size 300 width and 300 height
        setSize(300, 300);

        // setting the title of Frame
        setTitle("This is our basic AWT example");

        // no layout manager
        setLayout(null);

        // now frame will be visible, by default it is not visible
        setVisible(true);

        // creating a button
    }
    

    // main method
    public static void main(String args[]) {

        // creating instance of Frame class
        d51223 f = new d51223();
        f.AWTExample1();
       
    }

}