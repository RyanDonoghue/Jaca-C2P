public class rectangleTest
{
  public static void main(String[] args)
  {
    Rectangle newRectangle = new Rectangle();
    System.out.println("Please enter the width of the rectangle: ");
    double w = EasyIn.getDouble();
    newRectangle.setWidth(w);
    System.out.println("Please enter the length of the rectangle: ");
    double len = EasyIn.getDouble();
    newRectangle.setLength(len);
    double perimeter = perimeter(newRectangle.getWidth(), newRectangle.getLength());
    double area = area(newRectangle.getWidth(), newRectangle.getLength());
    System.out.println("Width: " + newRectangle.getWidth());
    System.out.println("Length:  " + newRectangle.getLength());
    System.out.println("Perimter:  " + perimeter);
    System.out.println("Area:  " + area);
  }
  
  public static double perimeter(double width, double length)
  {
    return (width + length) * 2.0D;
  }
  
  public static double area(double width, double length)
  {
    return width * length;
  }
}
