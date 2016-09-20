
public class TryCatchStatement {
    public static void main (String args[]){
        
        int[] array = new int[10];
        try{
            System.out.println("Before valid array assignment");
            array[0] = 1;
            System.out.println("Before invalid array assingment");
            array[100] = 1;
            System.out.println("After array exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("An Array index error has occured");
        }
    }
}
