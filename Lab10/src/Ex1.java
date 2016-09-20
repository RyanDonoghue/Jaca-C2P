import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Ex1  {
    public static void main (String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Please enter the radius of the circle : ");
        double r = Double.parseDouble(in.readLine());
        System.in.skip(2);
        
        System.out.println("Area : " + (3.14)*Math.pow(r,2) );
    }
}