
public class QuadraticClass {
//declares all variables
	double a;
	double b;
	double c;
	
//sets default variables if no argument	
	public QuadraticClass()
	{
		a = 1;
		b = 1;
		c = 1;
	}
	
//sets the constructor to override  a, b, and c to new value
	public QuadraticClass(double variablea, double variableb, double variablec)
	{
		a = variablea;
		b = variableb;
		c = variablec;
	}
	
//identifies quadratic formula for addition and subtraction of b	
	public double quadraticformulaplus()
	{
		return (-(b) + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
	}
	public double quadraticformulaminus()
	{
		return (-(b) - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
	}
	
//establishes calcDiscriminent method
	public double calcDiscriminent()
	{
		return (Math.pow(b,2)-4*a*c);
	}
	
//establishes isReal method that returns false if the value is not real	
	public boolean isReal()
	{
		if (calcDiscriminent()>=0)
				return (true);
		else
				return false;
	}
//establishes quadFormMax method which chooses the highest number out of 2 answers from+ the quadratic formula
	public double quadFormMax() 
	{
		return Math.max(quadraticformulaplus(), quadraticformulaminus());		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

