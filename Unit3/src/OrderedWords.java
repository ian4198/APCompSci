import java.util.Scanner; 
public class OrderedWords {
	
	public static void main(String[] args) {
		
		System.out.print("Please Enter Three Words");
		  Scanner scannerInput = new Scanner(System.in);  // Create a Scanner object
		String Input = scannerInput.next(); //creates variables that takes user inputs
		String Input2 = scannerInput.next();
		String Input3 = scannerInput.next();
		
		System.out.print("Would you like the words to be sorted alphebetically, or lexicographically? Type 1 for LEXIGRAPHIC or 2 for ALPHBETICAL");
		int Input4 = scannerInput.nextInt(); //takes user input whether to sort based on integer
		
		if (Input4 == 1) //if the vaule is 1, sort lexicograpically, otherwise sort alphabetically
		{
			int num = (Input.compareTo(Input2)); //creates variables that store compared inputs 
			int num2 = (Input.compareTo(Input3)); 
			int num3 = (Input2.compareTo(Input3)); 
			
			if (num < 0 && num2 < 0 && num3 < 0) //if statements that order words if > or < 0
				{
					System.out.println(Input + " " + Input2 + " " + Input3);
				}
			else
				if (num < 0 && num2 < 0 && num3 > 0) 
				{
					System.out.println(Input + " " + Input3 + " " + Input2); 
				}
			else	
				if (num2 > 0 && num3 < 0 && num > 0)
				{
					System.out.println(Input2 + " " + Input3 + " " + Input);
				}
			else	
				if (num2 < 0 && num3 < 0 && num > 0) 
				{
					System.out.println(Input2 + " " + Input + " " + Input3);
				}
			else	
				if(num3 > 0 && num > 0 && num2 > 0)
				{
					System.out.println(Input3 + " " + Input2 + " " + Input);
				}
			else	
				if (num3 > 0 && num < 0 && num2 > 0)
				{	
					System.out.println(Input3 + " " + Input + " " + Input2);
				}
			}	
		else //if any number other than one, sorts alphabetically
		{
			int num = (Input.toUpperCase().compareTo(Input2.toUpperCase())); //creates variables that store uppercase user inputs and compares them
			int num2 = (Input.toUpperCase().compareTo(Input3.toUpperCase())); //doing so makes them all sorted equally regardless of which case
			int num3 = (Input2.toUpperCase().compareTo(Input3.toUpperCase()));
		
			if (num < 0 && num2 < 0 && num3 < 0) //if statements that order words by vaules of characters
			{
				System.out.println(Input + " " + Input2 + " " + Input3); 
			}
		else
			if (num < 0 && num2 < 0 && num3 > 0) 
			{
				System.out.println(Input + " " + Input3 + " " + Input2); 
			}
		else	
			if (num2 > 0 && num3 < 0 && num > 0)
			{
				System.out.println(Input2 + " " + Input3 + " " + Input);
			}
		else	
			if (num2 < 0 && num3 < 0 && num > 0) 
			{
				System.out.println(Input2 + " " + Input + " " + Input3);
			}
		else	
			if(num3 > 0 && num > 0 && num2 > 0)
			{
				System.out.println(Input3 + " " + Input2 + " " + Input);
			}
		else	
			if (num3 > 0 && num < 0 && num2 > 0)
			{	
				System.out.println(Input3 + " " + Input + " " + Input2);
			}
		}	
				
				
				
				
				
				
				
				
				
				
	}

}