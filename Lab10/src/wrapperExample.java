public class wrapperExample {
    public static void main (String args[]){
        
        //convert float to Float
        Float floatObject = new Float(1.2f);
        Float primitiveFloat = floatObject.floatValue();
        
        //convert double to Double
        Double doubleObject = new Double (2.0d);
        Double primitiveDouble  = doubleObject.doubleValue();
        
        //convert int to Integer
        Integer intObject = new Integer(20);
        Integer primitiveInt = intObject.intValue();
        
        //convert char to Character
        Character charObject = new Character('a');
        Character primitiveChar = charObject.charValue();
        
    }
}
