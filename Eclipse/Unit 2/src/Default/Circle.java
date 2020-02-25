package Default;


public class Circle {

	private double radius;
	
	public Circle()
	{
		radius = 1;
	}
	public Circle(double newRadius)
	{
		radius = newRadius;
	}
	
	//Methods:
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	public double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}
	
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	
	public void printinfo()
	{
		 System.out.println("The radius is " + radius);
		 System.out.println("The circumfrence is " + getPerimeter());
		 System.out.println("The area is " + getArea());
	}
	
}
