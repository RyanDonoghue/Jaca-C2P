import javax.swing.JOptionPane;

public class Ex2 {
     public static void main (String args[]){
         
         double index = 1;
         String content = "";
         content = "Num   Square   Cube" + '\n';
         
         while(index != 11)
         {
             content += index + "          " + Math.pow(index,2) + "        " + Math.pow(index, 3) + '\n';
             index++;
         }
         JOptionPane.showMessageDialog(null, content, "My Message Box", 1);
             
     }
    
}
