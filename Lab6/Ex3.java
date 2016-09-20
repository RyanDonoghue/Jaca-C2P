import javax.swing.*;

public class Ex3 {
    public static void main (String args[]){
        
       String  firstName = JOptionPane.showInputDialog("Please enter your first name");
       String  lastName = JOptionPane.showInputDialog("Please enter your last name");
       
       String name = firstName + " " + lastName;
       JOptionPane.showMessageDialog(null, "Hello " + name, "My Message Box", 1);
        
    }
    
}
