package Default;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		//String name = input.nextLine();
		System.out.println("What is your age?");
		int age = input.nextInt();
		//System.out.println("Hi " + (name) + ", You are " + (age) + " years old. Next year you will be " + (age+1) + " years old");
		
		Circle circ1 = new Circle(); //rad=1
		Circle cric2 = new Circle(5); //rad=5
		double rad3 = 7;
		Circle criket3 = new Circle(rad3); //rad=rad3
	
		circ1.printinfo();
	
		
		
		
		
		
	}

}
