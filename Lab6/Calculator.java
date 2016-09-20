import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.Panel;
import java.awt.Dimension;
import java.awt.Font;

public class Calculator extends Frame implements ActionListener {
    
    private TextField display;
    private Panel top;
    private Panel bottom;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button divide;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button multiply;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button subtract;
    private Button num0;
    private Button CE;
    private Button equals;
    private Button plus;
    private char Operator = ' ';
    private boolean previous = false;
    private float input1;
    private float result;
    private float input2;
    
    
    Calculator(){ 
        // Configure Frame
        setSize(350, 500);
        setTitle("Calculator"); 
        setLayout(new FlowLayout());
        setBackground(Color.WHITE);
        this.setVisible(true);
        // Change Font for Calculator Display
        Font font1 = new Font("SansSerif", Font.BOLD, 32);

        top = new Panel(new FlowLayout());
        top.setPreferredSize(new Dimension(350, 50));
        bottom = new Panel(new GridLayout(4,4));
        bottom.setPreferredSize(new Dimension(350, 400));
        bottom.setBackground(new Color(0, 0, 0));
        top.setBackground(Color.WHITE);
        top.setVisible(true);
         
        TextField display = new TextField(17);
        display.setSize(350,30);
        display.setFont(font1);
        display.setEditable(false);
        Button num7=new Button("7");
        Button num8=new Button("8");
        Button num9=new Button("9");
        Button divide=new Button("/");
        Button num4=new Button("4");
        Button num5=new Button("5");
        Button num6=new Button("6");
        Button multiply=new Button("x");
        Button num1=new Button("1");
        Button num2=new Button("2");
        Button num3=new Button("3");
        Button subtract=new Button("-");
        Button num0=new Button("0");
        Button CE=new Button("CE");
        Button equals=new Button("=");
        Button plus=new Button("+");
        
        // Change colours of calculator buttons
        num1.setBackground(Color.white);
        num2.setBackground(Color.white);
        num3.setBackground(Color.white);
        num4.setBackground(Color.white);
        num5.setBackground(Color.white);
        num6.setBackground(Color.white);
        num7.setBackground(Color.white);
        num8.setBackground(Color.white);
        num9.setBackground(Color.white);
        num0.setBackground(Color.white);
        subtract.setBackground(Color.white);
        plus.setBackground(Color.white);
        multiply.setBackground(Color.white);
        divide.setBackground(Color.white);
        CE.setBackground(Color.white);
        equals.setBackground(Color.white);
        
        
        add(top);
        add(bottom);
        top.add(display);
        bottom.add(num7); 
        bottom.add(num8);
        bottom.add(num9);
        bottom.add(divide);
        bottom.add(num4);
        bottom.add(num5);
        bottom.add(num6);
        bottom.add(multiply);
        bottom.add(num1);
        bottom.add(num2);
        bottom.add(num3);
        bottom.add(subtract);
        bottom.add(CE);
        bottom.add(num0);
        bottom.add(equals);
        bottom.add(plus);
        
        // Number Button Action Listeners
        num1.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    display.setText(display.getText() + "1");
                }
        });
        num2.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    display.setText(display.getText() + "2");
                }
        });
        num3.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    display.setText(display.getText() + "3");
                }
        });
        num4.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    display.setText(display.getText() + "4");
                }
        });
        num5.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    display.setText(display.getText() + "5");
                }
        });
        num6.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    display.setText(display.getText() + "6");
                }
        });
        num7.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    display.setText(display.getText() + "7");
                }
        });
        num8.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    display.setText(display.getText() + "8");
                }
        });
        num9.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    display.setText(display.getText() + "9");
                }
        });
        num0.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    display.setText(display.getText() + "0");
                }
        });
        
      // Operator Action Listeners  
        equals.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    
                    switch(Operator){
                        case '/': 
                            result = input1 / Float.parseFloat(display.getText());
                            display.setText(String.valueOf(result));
                            Operator = '0';
                         break;   
                            case '*': 
                            result = input1 * Float.parseFloat(display.getText());
                            display.setText(String.valueOf(result));
                            Operator = '0';
                         break;
                        case '+': 
                            result = input1 + Float.parseFloat(display.getText());
                            display.setText(String.valueOf(result));
                            Operator = '0';
                         break;
                        case '-': 
                            result = input1 - Float.parseFloat(display.getText());
                            display.setText(String.valueOf(result));
                            Operator = '0';
                         break;
                    };
                    
                }
        });
        CE.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    Operator = ' ';
                    input1 = 0;
                    display.setText("");
                    previous = false;                   
                }
        });       
        plus.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                input1 = Float.parseFloat(display.getText());
                Operator = '+'; 
                display.setText("");    
                }
        });
        subtract.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                input1 = Float.parseFloat(display.getText());
                Operator = '-'; 
                display.setText("");    
                }
        });
        multiply.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                input1 = Float.parseFloat(display.getText());
                Operator = '*'; 
                display.setText("");   
                }
        });
       divide.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                input1 = Float.parseFloat(display.getText());
                Operator = '/'; 
                display.setText("");
                }
        });

       
    }  
    
    @Override
	public void actionPerformed(ActionEvent e) {
	}
        
    public static void main(String args[])
        {  
                Calculator Calc=new Calculator();  
                Calc.addWindowListener(new WindowListener() 
                       {
                           @Override
                           public void windowClosed(WindowEvent arg0) {

                           System.out.println("Window close event occur");
                           System.exit(0);
                            }      
                           @Override
                           public void windowActivated(WindowEvent arg0) {
                               System.out.println("Window Activated");
                           }
                           @Override
                           public void windowClosing(WindowEvent arg0) {
                               System.out.println("Window Closing");
                               System.exit(0);;
                           }
                           @Override
                           public void windowDeactivated(WindowEvent arg0) {
                               System.out.println("Window Deactivated");
                           }
                           @Override
                           public void windowDeiconified(WindowEvent arg0) {
                               System.out.println("Window Deiconified");
                           }
                           @Override
                           public void windowIconified(WindowEvent arg0) {
                               System.out.println("Window Iconified");
                           }
                           @Override
                           public void windowOpened(WindowEvent arg0) {
                               System.out.println("Window Opened");
                           }
                       }
           );
         }
    
}
