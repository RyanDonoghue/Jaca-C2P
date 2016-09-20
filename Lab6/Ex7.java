import javax.swing.*;
public class Ex7 {
    public static void main (String args[]){
        
        String numTemp;
        double num;
        String option;
        String plusTemp;
        String minusTemp;
        String multipliedTemp;
        String dividedTemp;
        double result;
        double plus;
        double minus;
        double multiplied;
         double divided;
         int index = 1;
         String results = "";
        
        numTemp = JOptionPane.showInputDialog("Please enter a number");
        num = Integer.parseInt(numTemp);
         
        option = JOptionPane.showInputDialog("Please key in an option:" + '\n' 
                                                                                + "sqr" + '\n'
                                                                                + "inv" + '\n'
                                                                                + "cube" + '\n' 
                                                                                + "Or binary operator:" + '\n'
                                                                                + "plus " +'\n'
                                                                                + "minus " +'\n'
                                                                                + "multiplied by " +'\n'
                                                                                + "divided by " + '\n'
                                                                                + "times ");
         
         switch(option)
         {
            case "sqr":
            result = Math.pow(num, 2) ; 
            JOptionPane.showMessageDialog(null, num + " squared is: " + result, "My Message Box", 1);
            break;
            
            case "inv":
            result =  1/num;    
            JOptionPane.showMessageDialog(null,num + " inversed is: " + result, "My Message Box", 1);
            break;
            
            case "cube":result = Math.pow(num,3);  
            JOptionPane.showMessageDialog(null,num + " cubed: " + result, "My Message Box", 1);
            break;
            
            case "plus":    
            plusTemp = JOptionPane.showInputDialog("Please enter a secondnumber");
            plus = Integer.parseInt(plusTemp);
            result = num + plus;
            JOptionPane.showMessageDialog(null,num + " plus: " + plus + ":" + result, "My Message Box", 1);
            
            break;
            
            case "minus":   
            minusTemp = JOptionPane.showInputDialog("Please enter a secondnumber");
            minus = Integer.parseInt(minusTemp);
            result = num - minus;
            JOptionPane.showMessageDialog(null,num + " minus" + minus + " : " + result, "My Message Box", 1);
            break;
            
            case "multiplied by":
            multipliedTemp = JOptionPane.showInputDialog("Please enter a secondnumber");
            multiplied = Integer.parseInt(multipliedTemp);
            result  = num*multiplied;
            JOptionPane.showMessageDialog(null,num + " multiplied by " + multiplied + " : " + result, "My Message Box", 1);
            
            break;
            
            case "divided by":  
            dividedTemp = JOptionPane.showInputDialog("Please enter a secondnumber");
            divided = Integer.parseInt(dividedTemp);
            result = num/divided;
            JOptionPane.showMessageDialog(null,num + " divided by: " + result, "My Message Box", 1);
            break;
            case "times":
            while (index != 11){
                result = num*index;
                results += num + " times " + index + " equals "  + result+ '\n' ;
                 index++;
            }
            JOptionPane.showMessageDialog(null, results, "My Message Box", 1);
            
            default:    JOptionPane.showMessageDialog(null, "Please enter a valid option ", "My Message Box", 1);
            break;
         }
         
    }
}
