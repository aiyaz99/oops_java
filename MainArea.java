abstract class Shape{
    double x;
    double y;
    Shape(double l, double b)
    {
      x=l;
      y=b;
    }
    abstract double printArea();
  }
  
  class Rectangle extends Shape
  {
    Rectangle(double length, double width)
    {
      super(length,width);
    }
    double printArea()
    {
      System.out.println("Inside Area for Rectangle");
      return x*y;
    }
  }
  
  
  class Triangle extends Shape
  {
    Triangle(double base, double height)
    {
      super(base,height);
    }
    double printArea()
    {
      System.out.println("Inside Area for Triangle");
      return x*y*0.5;
    }
  }
  
  
  class Circle extends Shape
  {
    Circle(double radius, double empty)
    {
      super(radius,empty);
    }
    double printArea()
    {
      System.out.println("Inside Area for Circle");
      return Math.PI*x*x;
    }
  }
  
  class MainArea
  {
    public static void main (String args[])
    {
      Rectangle r = new Rectangle(9,5);
      Triangle t = new Triangle(10,8);
      Circle c = new Circle(3,0);
      
      Shape s;
      s = r;
      System.out.println("Area is: " + s.printArea());
      s = t;
      System.out.println("Area is: " + s.printArea());
      s = c;
      System.out.println("Area is: " + s.printArea());
    }
  }
  