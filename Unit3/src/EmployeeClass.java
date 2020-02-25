
public class EmployeeClass {

	double hourlywage;
	String employeeName;	
	double hoursWorked;
	
	public EmployeeClass()
	{
		employeeName = ("NAME NOT FOUND");
		hourlywage = 0.00;
		hoursWorked = 0.00;
	}
	
	public EmployeeClass(String newemployeeName, double newhourlywage, double newhoursWorked)
	{
		employeeName = newemployeeName;
		hourlywage = newhourlywage;
		hoursWorked = newhoursWorked;
	}
	
	public double getWage()
	{
		return hourlywage;
	}
	
	public void setHours(double newhours)
	{
		hoursWorked = newhours;
	}
	
	public double getSalary()
	{
		if (hoursWorked>40)
			return (((hoursWorked-40)*(hourlywage*1.5))+(hourlywage*hoursWorked)); 
	
		else
			
		if (hoursWorked==40);
			return (hourlywage*hoursWorked);
	}
	
	
	
	
	
	
	
	
	
	
	
}
