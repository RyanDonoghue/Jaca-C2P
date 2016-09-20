public class Thermometer
{
  private double celsius;
  private double fahren;
  
  public Thermometer()
  {
    setCelsius(0.0D);
  }
  
  public Thermometer(double cel)
  {
    setCelsius(cel);
  }
  
  public void setCelsius(double cel)
  {
    this.celsius = cel;
  }
  
  public void setFahrenheit(double fah)
  {
    this.fahren = ((fah - 32 ) * 5/9);
  }
  
  public double getCelsius()
  {
    return this.celsius;
  }
  
  public double getFahrenheit()
  {
    return this.fahren;
  }
}
