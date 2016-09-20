public class ThrowStatement {
    public static void main (String args[]){
        int[] array = new int[10];
        try{
            array[100] = 1;
        }
        catch(ArrayIndexOutOfBoundsException e){
            e = new ArrayIndexOutOfBoundsException("Please ensure your array index is within bounds");
            throw(e);
        }
    }
}
