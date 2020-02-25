import java.util.*; //imports java scanner class methods
public class GPACalc { 
	//Ian Raistrick- 
	//The program takes user inputs, which are letter grades ranging from a-f.
	//Attached to each input is also either an F or an H in order to designate it as either a full (F), or half (H) year course.
	//(Example: User might input, AF, BH, CF, etc.)
	//Each combination of a letter grade and either an h or f is then tallied for a point vaule and credit vaule, -
		//to variable a and r respectivly.
	//The user then hits q to calculate, which takes the total point vaule (a) and divides it by the total credit vaule (r); -
		//aswell also ending the loop.
	

	public static void main(String[] args) {
		
		int x = 0;	//Intializes variables
		double a = 0.0;
		double r = 0.0;
		System.out.println("Please enter your letter grades, attaching an F to the grade if a full year course, "
				+ "and an H if a half year. Press Q to calculate (answers are not cap-sensitive)"); //asks for user input.
		
			Scanner input = new Scanner(System.in); //creates new scanner object and method to store user input into variable j.
			String j = input.nextLine();
			j = j.toUpperCase(); //Upper-cases all string inputs so capitalization of words don't affect the program.
			
			while (x != 1) //continues to loop until x = 1.
			{
				
				switch (j) //switch statement that compares each case and makes changes to variables according to each case.
				{
				
				case ("AF"): //Looks to see that the user input is the same as the string "AF", meaning that they got an A for a full year class.
					a += 4.0; //Increases vaule of variable a (total points).
					r++; //Increases vaule of variable r (total credits for class).
					break;
				case ("BF"):      //The program will do the same for each case, except when the user hits q, or no case its met.
					a += 3.0;
					r++;
					break;
				case ("CF"):
					a += 2.0;
					r++;
					break;
				case ("DF"):
					a += 1.0;
					r++;
					break;
				case ("FF"):
					r++;
					break;
				case ("AH"):
					a += 4.0;
					r += 0.5;
					break;
				case ("BH"):
					a += 3.0;
					r += 0.5;
					break;
				case ("CH"):
					a += 2.0;
					r += 0.5;
					break;
				case ("DH"):
					a += 1.0;
					r += 0.5;
					break;
				case ("FH"):
					r += 0.5;
					break;
				case ("Q"): //In the case that the user hits q, it will calculate the total point vaule (a), divided by the total credit vaule (r).
					x = 1; //Sets x to 1, ending the while statement.
					System.out.println( "Your GPA is " + (a)/(r)); //prints out GPA.
					break;
				default: //If no cases are met, then the user did not type an acceptable input and must try again.
					System.out.println("Invalid input, please try again"); //Notifies the user that the input was invalid.
					break;
				}	
				input = new Scanner(System.in); //Re-asks for input after one iteration of the switch is done -
				j = input.nextLine();				//will not stop until while statement is closed.
				j = j.toUpperCase();
			}
	}
}
			
				
			
 
