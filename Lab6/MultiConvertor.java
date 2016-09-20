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

public class MultiConvertor extends Frame implements ActionListener {
    private Panel display;
    private Panel operations;
    private Panel numpad;
    private Panel numpadEXT;
    private Panel gap;
    private TextField entry;
    private TextField type;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button num0;
    private Button CLEAR;
    private Button inches;
    private Button feet;
    private Button gbp;
    private Button eur;
    private Button cel;
    private Button fahr;
    private float result;
    private boolean empty;
    private float temp;
    
    
    MultiConvertor(){
        setSize(600, 500);
        setTitle("Currency Convertor"); 
        setLayout(new FlowLayout());
        setBackground(Color.WHITE);
        this.setVisible(true);
        
        // custom fonts for display
        Font font1 = new Font("SansSerif", Font.BOLD, 26);
        Font font2 = new Font("SansSerif", Font.BOLD, 38);
        
        // create panels
        display = new Panel (new GridLayout(1,2));
        display.setPreferredSize(new Dimension(570, 50));
        display.setVisible(true);
        
        operations = new Panel (new GridLayout(3,2));
        operations.setPreferredSize(new Dimension(570, 150));
        operations.setVisible(true);
        
        numpad = new Panel (new GridLayout(3,3));
        numpad.setPreferredSize(new Dimension(570, 150));
        numpad.setVisible(true);
        
        numpadEXT = new Panel (new GridLayout(1,2));
        numpadEXT.setPreferredSize(new Dimension(570, 50));
        numpadEXT.setVisible(true);
        
        gap = new Panel (new FlowLayout());
        gap.setPreferredSize(new Dimension(330, 25));
        gap.setVisible(true);
        
        // create two seperate text fields within the display panel
        TextField entry = new TextField(11);
        TextField type = new TextField(3);
        entry.setFont(font1);
        entry.setEditable(false);
        type.setFont(font2);
        type.setEditable(false);
        type.setText("INCHES");
        empty = true;
        
        // Creating Buttons for numpad
        Button num1=new Button("1");
        Button num2=new Button("2");
        Button num3=new Button("3");
        Button num4=new Button("4");
        Button num5=new Button("5");
        Button num6=new Button("6");
        Button num7=new Button("7");
        Button num8=new Button("8");
        Button num9=new Button("9");
        Button num0=new Button("0");
        Button CLEAR = new Button("CE");
        
        Button inches = new Button("Inches");
        Button feet = new Button("Feet");
        Button gbp = new Button("GBP");
        Button eur = new Button("EUR");
        Button cel = new Button("CEL");
        Button fahr = new Button("FAHR");
        
        add(display);
        add(gap);
        add(operations);
        add(numpad);
        add(numpadEXT);
                
        display.add(entry);
        display.add(type);
        
        operations.add(inches);
        operations.add(feet);
        operations.add(gbp);
        operations.add(eur);
        operations.add(cel);
        operations.add(fahr);
        
        numpad.add(num7); 
        numpad.add(num8);
        numpad.add(num9);
        numpad.add(num4);
        numpad.add(num5);
        numpad.add(num6);
        numpad.add(num1);
        numpad.add(num2);
        numpad.add(num3);
        numpadEXT.add(num0);
        numpadEXT.add(CLEAR);
        
        num1.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    entry.setText(entry.getText() + "1");
                    empty = false;
                }
        });
        num2.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    entry.setText(entry.getText() + "2");
                    empty = false;
                }
        });
        num3.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    entry.setText(entry.getText() + "3");
                    empty = false;
                }
        });
        num4.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    entry.setText(entry.getText() + "4");
                    empty = false;
                }
        });
        num5.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    entry.setText(entry.getText() + "5");
                    empty = false;
                }
        });
        num6.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    entry.setText(entry.getText() + "6");
                    empty = false;
                }
        });
        num7.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    entry.setText(entry.getText() + "7");
                    empty = false;
                }
        });
        num8.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    entry.setText(entry.getText() + "8");
                    empty = false;
                }
        });
        num9.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    entry.setText(entry.getText() + "9");
                    empty = false;
                }
        });
        num0.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    entry.setText(entry.getText() + "0");
                    empty = false;
                }
        });
        CLEAR.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    type.setText("INCHES");
                    entry.setText("");
                    empty = true;
                }
        });
        
        // Creat Action Listeners for operations
        inches.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    if ("FEET".equals(type.getText()) && empty != true ){
                        result = Float.parseFloat(entry.getText()) * 12f;
                        entry.setText(String.valueOf(result));
                    }
                    type.setText("INCHES");
                }
        });
        feet.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    if ("INCHES".equals(type.getText()) && empty != true ){
                        result = Float.parseFloat(entry.getText()) / 12f;
                        entry.setText(String.valueOf(result));
                    }
                    type.setText("FEET");
                }
        });
        gbp.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    if ("EUR".equals(type.getText()) && empty != true ){
                        result = Float.parseFloat(entry.getText()) *0.79f;
                        entry.setText(String.valueOf(result));
                    }
                    type.setText("GBP");
                }
        });
        eur.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    if ("GBP".equals(type.getText()) && empty != true ){
                        result = Float.parseFloat(entry.getText()) /0.79f;
                        entry.setText(String.valueOf(result));
                    }
                    type.setText("EUR");
                }
        });
        cel.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    if ("FAHRENHEIT".equals(type.getText()) && empty != true ){
                        temp = Float.parseFloat(entry.getText());
                        result = (temp - 32f)*0.555f;
                        entry.setText(String.valueOf(result));
                        type.setText("CELCIUS");
                    }
                    
                }
        });
        fahr.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
                {
                    if ("CELCIUS".equals(type.getText()) && empty != true ){
                        temp = Float.parseFloat(entry.getText());
                        result =  (temp*1.8f) + 32f;
                        entry.setText(String.valueOf(result));
                    }
                    type.setText("FAHRENHEIT");
                }
        });
    }
    public void actionPerformed(ActionEvent e) {
    }
    public static void main (String args[]){
        MultiConvertor convertor = new MultiConvertor();
        convertor.addWindowListener(new WindowListener() {
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
        });        
    }
}
