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

public class CurrencyConvertor extends Frame implements ActionListener {
    private Panel display;
    private Panel operators;
    private Panel numpad;
    private Panel numpadEXT;
    private Panel gap;
    
    private TextField entry;
    private TextField currCurrency;
    
    private Button EUR;
    private Button USD;
    private Button GBP;
    private Button JPY;
    
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
    private Button blank;
    private boolean empty = true;
    private float result;
    
    
CurrencyConvertor(){
        setSize(600, 450);
        setTitle("Currency Convertor"); 
        setLayout(new FlowLayout());
        setBackground(Color.WHITE);
        this.setVisible(true);
        
        // Creating custom fonts for entry
        
        Font font1 = new Font("SansSerif", Font.BOLD, 26);
        Font font2 = new Font("SansSerif", Font.BOLD, 38);
        
        // Creating sections of the window
        
        display = new Panel (new GridLayout(1,2));
        display.setPreferredSize(new Dimension(570, 50));
        display.setVisible(true);
        
        
        operators = new Panel (new GridLayout(2,2,0,0));
        operators.setPreferredSize(new Dimension(570, 100));
        operators.setVisible(true);
        
        numpad = new Panel (new GridLayout(3,3,0,0));
        numpad.setPreferredSize(new Dimension(570, 150));
        numpad.setVisible(true);
        
        numpadEXT = new Panel (new GridLayout(1,2,0,0));
        numpadEXT.setPreferredSize(new Dimension(570, 50));
        numpadEXT.setVisible(true);
        
        gap = new Panel (new FlowLayout());
        gap.setPreferredSize(new Dimension(330, 25));
        gap.setVisible(true);
        
        
        // Creating text fields for top entry
        
        TextField entry = new TextField(11);
        TextField currCurrency = new TextField(3);
        entry.setFont(font1);
        entry.setEditable(false);
        currCurrency.setFont(font2);
        currCurrency.setEditable(false);
        currCurrency.setText("EUR");
        
        
        // Creating buttons for currency selection panel
        
        Button EUR=new Button("EUR");
        Button USD=new Button("USD");
        Button GBP=new Button("GBP");
        Button JPY=new Button("JPY");
        
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
        
        
        // Changing background color of buttons
        EUR.setBackground(Color.white);
        USD.setBackground(Color.white);
        GBP.setBackground(Color.white);
        JPY.setBackground(Color.white);
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
        CLEAR.setBackground(Color.white);
        entry.setBackground(Color.white);
        currCurrency.setBackground(Color.white);
        
        
        add(display);
        add(gap);
        add(operators);
        add(gap);
        add(numpad);
        add(numpadEXT);
        
        display.add(entry);
        display.add(currCurrency);
        
        operators.add(EUR);
        operators.add(USD);
        operators.add(GBP);
        operators.add(JPY);
        
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
        
        //Creating Action Listeners for numpad buttons
        num1.addActionListener((ActionEvent e) -> {
            entry.setText(entry.getText() + "1");
            empty = false;
        });
        num2.addActionListener((ActionEvent e) -> {
            entry.setText(entry.getText() + "2");
            empty = false;
        });
        num3.addActionListener((ActionEvent e) -> {
            entry.setText(entry.getText() + "3");
            empty = false;
        });
        num4.addActionListener((ActionEvent e) -> {
            entry.setText(entry.getText() + "4");
            empty = false;
        });
        num5.addActionListener((ActionEvent e) -> {
            entry.setText(entry.getText() + "5");
            empty = false;
        });
        num6.addActionListener((ActionEvent e) -> {
            entry.setText(entry.getText() + "6");
            empty = false;
        });
        num7.addActionListener((ActionEvent e) -> {
            entry.setText(entry.getText() + "7");
            empty = false;
        });
        num8.addActionListener((ActionEvent e) -> {
            entry.setText(entry.getText() + "8");
            empty = false;
        });
        num9.addActionListener((ActionEvent e) -> {
            entry.setText(entry.getText() + "9");
            empty = false;
        });
        num0.addActionListener((ActionEvent e) -> {
            entry.setText(entry.getText() + "0");
        });
        CLEAR.addActionListener((ActionEvent e) -> {
            empty = true;
            currCurrency.setText("EUR");
        });
        
        
        
        // Creating Action Listerners for operators
        
        EUR.addActionListener((ActionEvent e) -> {
            if(empty != true){
                switch(currCurrency.getText()){
                    case "USD": 
                        result = Float.parseFloat(entry.getText()) * 0.91f;
                        entry.setText(String.valueOf(result));
                        currCurrency.setText("EUR");
                        break;
                    case "GBP":
                        result = Float.parseFloat(entry.getText()) * 1.28f;
                        entry.setText(String.valueOf(result));
                        currCurrency.setText("EUR");
                        break;
                    case "JPY":
                        result = Float.parseFloat(entry.getText()) * 0.0080f;
                        entry.setText(String.valueOf(result));
                        currCurrency.setText("EUR");
                        break;
                    default:
                        break;
                }
            }
            else{
                currCurrency.setText("EUR");
            }
        });
        USD.addActionListener((ActionEvent e) -> {
            if(empty != true){
                
                switch(currCurrency.getText()){
                    case "EUR":
                        result = Float.parseFloat(entry.getText()) * 1.1f;
                        entry.setText(String.valueOf(result));
                        currCurrency.setText("USD");
                        break;
                    case "GBP":
                        result = Float.parseFloat(entry.getText()) * 1.41f;
                        entry.setText(String.valueOf(result));
                        currCurrency.setText("USD");
                        break;
                    case "JPY":
                        result = Float.parseFloat(entry.getText()) * 0.0089f;
                        entry.setText(String.valueOf(result));
                        currCurrency.setText("USD");
                        break;
                    default:
                        break;
                }
            }
            else{
                currCurrency.setText("USD");
            }
        });  
        GBP.addActionListener((ActionEvent e) -> {
            if(empty != true){
                switch(currCurrency.getText()){
                    case "USD":
                        result = Float.parseFloat(entry.getText()) * 0.71f;
                        entry.setText(String.valueOf(result));
                        currCurrency.setText("GBP");
                        break;
                    case "EUR":
                        result = Float.parseFloat(entry.getText()) * 0.78f;
                        entry.setText(String.valueOf(result));
                        currCurrency.setText("GBP");
                        break;
                    case "JPY":
                        result = Float.parseFloat(entry.getText()) * 0.0063f;
                        entry.setText(String.valueOf(result));
                        currCurrency.setText("GBP");
                        break;
                    default:        
                        break;
                }
            }
            else{
                currCurrency.setText("GBP");
            }
        });
        JPY.addActionListener((ActionEvent e) -> {
            if(empty != true){
                switch(currCurrency.getText()){
                    case "USD":
                        result = Float.parseFloat(entry.getText()) * 112.89f;
                        entry.setText(String.valueOf(result));
                        currCurrency.setText("JPY");
                        break;
                    case "EUR":
                        result = Float.parseFloat(entry.getText()) * 124.5f;
                        entry.setText(String.valueOf(result));
                        currCurrency.setText("JPY");
                        break;
                    case "GBP":
                        result = Float.parseFloat(entry.getText()) * 159.74f;
                        entry.setText(String.valueOf(result));
                        currCurrency.setText("JPY");
                        break;
                    default:
                        currCurrency.setText("JPY");
                        break;
                }
            }
            else{
                currCurrency.setText("JPY");
            }
        });
}
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    public static void main (String args[]){
        CurrencyConvertor currConv=new CurrencyConvertor();  
                currConv.addWindowListener(new WindowListener() 
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