public class ThermoTest
{
  public static void main(String[] args)
  {
    System.out.println("Please enter a temperature in fahrenheit: ");
    double fah = EasyIn.getDouble();
    Thermometer thermA = new Thermometer();
    thermA.setFahrenheit(fah);
    System.out.println("Converted to Celsius: " + thermA.getFahrenheit());
  }
}
