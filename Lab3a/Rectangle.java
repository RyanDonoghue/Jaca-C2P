public class Rectangle
{
  private double width;
  private double length;
  
  public Rectangle()
  {
    setWidth(1.0D);
    setLength(1.0D);
  }
  
  public Rectangle(double len, double w)
  {
    setWidth(w);
    setLength(len);
  }
  
  public void setWidth(double w)
  {
    if ((w > 0.0) && (w < 20.0)) {
      this.width = w;
    }
  }
  
  public void setLength(double len)
  {
    if ((len > 0.0D) && (len < 20.0D)) {
      this.length = len;
    }
  }
  
  public double getLength()
  {
    return this.length;
  }
  
  public double getWidth()
  {
    return this.width;
  }
}
