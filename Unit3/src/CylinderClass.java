
public class CylinderClass extends CircleClass {

	private double height;
	
	public CylinderClass()
	{
		super();
		height = 1;
	}
	
	public CylinderClass(double height, double radius)
	{
		super(radius);
		this.height = height;

	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public double getArea()
	{
		return 2*super.getArea() + getCircumfrence()*height;
	}
	
	public double getVolume()
	{
		return height*super.getArea();
	}
}
