import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

public class calculator implements ActionListener {
    static JFrame frame;
    static JTextField field;
    static JButton[] numButton;
    static JButton[] funcButton;
    static JPanel panel;

    public static void main(String[] args) {
        frame = new JFrame("Calculator");
        panel = new JPanel();
        JPanel textBarPanel = new JPanel();
        field = new JTextField();
        numButton = new JButton[10];
        funcButton = new JButton[8];

        field.setEditable(false);
        field.setPreferredSize(new Dimension(410, 60));

        textBarPanel.add(field);
        textBarPanel.setPreferredSize(new Dimension(410, 60));
        textBarPanel.setLayout(new FlowLayout());

        panel.setPreferredSize(new Dimension(420, 510));
        panel.setLayout(new GridLayout(8, 4));

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(textBarPanel);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();

        declareButton();

        frame.setVisible(true);

    }


    static double n1=0,n2=0;
    static char operator = ' ';

    @Override
    public void actionPerformed(ActionEvent e) {
    String textFieldtext = "";
    Boolean numbutton = false;

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numButton[i]) {
                textFieldtext += numButton[i].getText();
                numbutton=true;
                break;
            }
        }
        if (!numbutton) {
            for (int i = 0; i < 8; i++) {
                if (e.getSource() == funcButton[i]) {
                    textFieldtext = funcButton[i].getText();
                    n2 = Double.parseDouble(field.getText());
                    field.setText("");
                    switch (i) {
                        case 0:
                            n1 += n2;
                            n2 = 0;
                            operator = '+';
                            break;

                        case 5:

                            switch (operator){
                                case '+':
                                    n1+=n2;
                                    n2=0;
                                    break;
                                case '-':
                                    n1-=n2;
                                    n2=0;
                                    break;
                                case '*':
                                    n1*=n2;
                                    n2=0;
                                    break;
                                case '/':
                                    n1+=n2;
                                    n2=0;
                                    break;
                                
                                default:
                                    break;
                            }
                            textFieldtext = "";
                            field.setText(String.valueOf(n1)); 
                            break;

                        default:
                            break;
                    }
                    break;
                }
            }
        }

       field.setText(field.getText() + textFieldtext);

       /*if (e.getSource() == funcButton[5]) {
           try {
               field.setText(evaluateEquation(field.getText()));
           } catch (Exception g) {
               field.setText("ERROR");
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e1) {
                   e1.printStackTrace();
               }
           }
       }*/
    }


    static void declareButton() {
        String[] nums = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        String[] func = { "+", "-", "*", "/", ".", "=", "Delete", "CLR" };

        for (int i = 0; i < 10; i++) {
            numButton[i] = new JButton(nums[i]);
            numButton[i].addActionListener(new calculator());
            panel.add(numButton[i]);
        }
        for (int i = 0; i < 8; i++) {
            funcButton[i] = new JButton(func[i]);
            funcButton[i].addActionListener(new calculator());
            panel.add(funcButton[i]);
        }
    }
}
