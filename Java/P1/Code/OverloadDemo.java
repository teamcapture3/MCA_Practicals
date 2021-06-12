class OverloadDemo
{
  void calculateArea(double r)
  {
    double area = 3.14*r*r;
    System.out.println("Area of the circle is: "+area+" sq units");
  }
  void calculateArea(float x, float y)
  {
    System.out.println("Area of the rectangle is: "+x*y+" sq units");
    System.out.println("Area of the triangle is: "+(x*y)/2+" sq units");
  }
  public static void main(String args[])
  {
    OverloadDemo obj = new OverloadDemo();
    obj.calculateArea(6.5); 
    obj.calculateArea(18,20);
    obj.calculateArea(6,2);
  }
}