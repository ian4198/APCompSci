
public class EmployeeClassTest {

	public static void main(String[] args) {
	
		EmployeeClass employee1 = new EmployeeClass("Bob", 15, 40);
		EmployeeClass employee2 = new EmployeeClass("Jeff", 23, 50);
		EmployeeClass employee3 = new EmployeeClass("Mary", 35, 46);
		
		System.out.println("Bob's normal hourly wage for the week is " + employee1.getWage() + " dollars an hour at " + employee1.getSalary() +" dollars a week");
		System.out.println("Jeff's normal hourly wage for the week is " + employee2.getWage() + " dollars an hour at " + employee2.getSalary() +" dollars a week");
		System.out.println("Mary's normal hourly wage for the week is " + employee3.getWage() + " dollars an hour at " + employee3.getSalary() +" dollars a week");
		
		System.out.println("-After adjusting the newly added hours worked for Bob, Jeff's reduction in hours, and Mary's reduction in hours...");
		
		employee1.setHours(46);
		employee2.setHours(42);
		employee2.setHours(40);
		
		System.out.println("Bob's new wage for the week is " + employee1.getSalary());
		System.out.println("Jeff's new wage for the week is " + employee2.getSalary());
		System.out.println("Mary's new wage for the week is " + employee3.getSalary());
		
		
		
		

	}

}
