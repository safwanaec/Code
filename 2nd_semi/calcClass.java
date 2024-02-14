
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class calcClass implements ActionListener {
    
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[5];
    JButton addButton,subButton,mulButton,divButton;
    JButton equButton;
    
    JPanel panel;
      
    double num1=0,num2=0,result=0;
    
    char operator;
    
    
    calcClass()
    {
        frame = new JFrame("calcClass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        
        textfield = new JTextField();
        textfield.setBounds(50,25,300,50);
        
        textfield.setEditable(false);
        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        
        equButton = new JButton("=");
       
        
       
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        
        functionButtons[4] = equButton;
        
        
        for(int i=0;i<5;i++)
        {
            functionButtons[i].addActionListener(this);
           
            functionButtons[i].setFocusable(false);
        }
        for(int i=0;i<10;i++)
        {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
           
            numberButtons[i].setFocusable(false);
        }
        
        
        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
       
        
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(addButton);
        
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(mulButton);
        
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        
        
        frame.add(panel);
        
        frame.add(textfield);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new calcClass();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++)
        {
            if(e.getSource() == numberButtons[i])
            {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        
        if(e.getSource() == addButton)
        {
                num1= Double.parseDouble(textfield.getText());
                operator = '+';
                textfield.setText("");
        }
        if(e.getSource() == subButton)
        {
                num1= Double.parseDouble(textfield.getText());
                operator = '-';
                textfield.setText("");
        }
        if(e.getSource() == mulButton)
        {
                num1= Double.parseDouble(textfield.getText());
                operator = '*';
                textfield.setText("");
        }
        if(e.getSource() == divButton)
        {
                num1= Double.parseDouble(textfield.getText());
                operator = '/';
                textfield.setText("");
        }
        if(e.getSource() == equButton)
        {
            num2= Double.parseDouble(textfield.getText());
            switch(operator)
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break; 
                    

    
            }
            textfield.setText(String.valueOf(result));
            num1= result;
        }
        
                
    }

}