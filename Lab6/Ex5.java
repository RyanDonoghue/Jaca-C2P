import javax.swing.*;
public class Ex5 {
    public static void main (String args[]){
        
        String numTemp;
        double num;
        String option;
        double result;
        
        numTemp = JOptionPane.showInputDialog("Please enter a number");
        num = Integer.parseInt(numTemp);
         
        option = JOptionPane.showInputDialog("Please key in an option" + '\n' + "sqr" + " " + "inv" + " "+ "cube");
         
         switch(option)
         {
            case "sqr":     result = Math.pow(num, 2) ; 
                                    JOptionPane.showMessageDialog(null, num + " squared is: " + result, "My Message Box", 1);
                                    break;
            case "inv":      result =  1/num;    
                                    JOptionPane.showMessageDialog(null,num + " inversed is: " + result, "My Message Box", 1);
                                    break;
            case "cube":  result = Math.pow(num,3);  
                                    JOptionPane.showMessageDialog(null,num + " cubed: " + result, "My Message Box", 1);
                                    break;
            default:    JOptionPane.showMessageDialog(null, "Please enter a valid option ", "My Message Box", 1);
         }
         
    }
}
