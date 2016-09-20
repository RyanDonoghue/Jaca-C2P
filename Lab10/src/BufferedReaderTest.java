import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class BufferedReaderTest {
    public static void main (String args[]) throws IOException{
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        // Reading Strings
        String s = in.readLine();
        
        // Reading Chars
        char c = (char) System.in.read();
        System.in.skip(2);
        
        // Reading integers
        int i = Integer.parseInt(in.readLine());
        
        // Reading doubles
        double d = Double.parseDouble(in.readLine());
        
        // Reading Floats
        float f = Float.parseFloat(in.readLine());
    }
}
