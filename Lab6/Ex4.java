import javax.swing.*;

public class Ex4 {
    public static void main (String args[]){
        String message;
       String  input = JOptionPane.showInputDialog("Please enter a number");
       int num = Integer.parseInt(input);
       
       
       if (num % 2 == 0)
       {
           message = "The number " + num + "is even.";
       }
       else
       {
           message = "The number " + num + " is odd.";
       }
       JOptionPane.showMessageDialog(null, message, "My Message Box", 1);
    }
    
}
