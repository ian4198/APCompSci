import java.util.*;
/**
 * The programs purpose is to take user defined inputs of temperatures, calculate the average temperature, max temperature, minimum temperature, 
 * and the days above the average temperature, then return that to the user.
 * @author iraistrick
 *
 */
public class AvgTempTest {

	public static void main(String[] args) {

		System.out.println("Please enter how many temperatures to be recorded"); 
		Scanner inputelement = new Scanner(System.in);
		int elementMax = inputelement.nextInt(); //Amount of temperatures to be recorded are taken down.
		int n = elementMax; //declares n amount for the array.
		if (n <= 0) { //if the set amount of temps are less or equal to 0, will ask for amount again until user enters a valid amount.
			System.out.println("Please enter a valid amount");

			while (n <= 0) { 
				inputelement = new Scanner(System.in);
				elementMax = inputelement.nextInt();
				n = elementMax;
			}

		}

		int List[] = new int[n]; //declares an array for storing temperatures with the element length defined by the user as n.

		System.out.println("Please enter temperatures to be recorded");
		
		for (int i = 0; i < n; i++) { //continues to request inputs until list has reached its total length 
			Scanner Input = new Scanner(System.in); //asks for user input to be recorded as input real.
			int inputreal = Input.nextInt();
			List[i] = inputreal;
		}

		System.out.println("The days average temperature was " + AvgHighTemp.avgTemp(List));
		System.out.println("The days max temperature was " + AvgHighTemp.maxTemp(List));
		System.out.println("The days minimum temperature was " + AvgHighTemp.minTemp(List));
		System.out.println("The day(s) above the average temperature was " + AvgHighTemp.numDaysAboveAvgTemp(List));
		//returns the average temperature, max temperature, minimum temperature, and number of days above average temperature.
	}

}
