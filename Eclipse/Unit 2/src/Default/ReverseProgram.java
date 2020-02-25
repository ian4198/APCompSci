package Default;
import java.util.Scanner;
public class ReverseProgram {
//Ian Raistrick, 9/16/19. The purpose of the program is to take a number, reverse it and then average the two numbers.
	
	public static void main(String[] args) {
		
		System.out.println("Please enter any three digit number");
		Scanner input = new Scanner(System.in);
		int primary = input.nextInt();
		System.out.println("The number you entered is " + primary);
		int secondary1 = (primary%10);
		int secondary2 = (primary/10%10);
		int secondary3 = (primary/100);
		System.out.println("In reverse, the number is " + secondary1 + secondary2 + secondary3);
		int terniary1 = (secondary1*100);
		int terniary2 = (secondary2*10);
		int terniary3 = (secondary3);
		int secondarymain = (terniary1 + terniary2 + terniary3);
		System.out.println("The average is " + (primary + secondarymain)/2.0);

	}

}


