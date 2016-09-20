public class Ex2a {
    public static void main (String args[]){
         System.out.print("Array Position: ");
         int res = Keyboard.readInt();
         int[] values = new int[10];
        
         try{
             values[res] = 12;
              System.out.println("Valid");
         }
         catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Not valid");
        }
    }
}
