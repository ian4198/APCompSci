
public class CircleClass {

	private double radius;

	public CircleClass() {

		radius = 1;
	}

	public CircleClass(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircumfrence() {
		return 2 * radius * Math.PI;
	}

	public String toString() {
		return "The Radius is " + radius;
	}

	public void printCircleInfo()
	{
		System.out.println("The Radius is " + radius);
		System.out.println("The Circumfrence is " + getCircumfrence());
		System.out.println("The Area is " + getArea());
	}
	
	public boolean circleEquals(CircleClass Circle)
	{
		if (this.radius == Circle.getRadius())
		{
			return true;
		}
		else
		{	
			return false;
		}
	}

}
