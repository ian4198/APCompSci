
import java.util.*;

public class ItemInventory {

	public static void main(String[] args) {
		InvoiceClass Receipt = new InvoiceClass(); //instantiates new invoice object
		int x = 0;
		while(x != 1) //loop that continues until user inputs -1 to stop
		{
			System.out.println("Please enter price of the item, type -1 to stop");
			Scanner input3 = new Scanner(System.in);
			double price = input3.nextDouble();
			if (price = -1) //if user entered -1, stops sets x to 1, stopping the loop
			{
				x = 1;
			}
			else //if -1 was not entered, continues loop
		{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the item name"); //asks for item name
		int quantity;
		double price;
		String name = input.nextLine();
		String pet;
		do {
			System.out.println("If a pet type Y for yes, if not, type N for no"); //asks for pet name
			pet = input.nextLine();
			pet = pet.toUpperCase();
		} while(!(pet.compareTo("Y") == 0) || (pet.compareTo("N") == 0)); // if not either Y or N, asks again
		
		System.out.println("Please enter the quantity of the item(s)"); //asks for quantity
		Scanner input2 = new Scanner(System.in);
		quantity = input2.nextInt();
		
		ItemClass name = new ItemClass(); //instantiates new Item object
		name.addItems(price, quantity, name, pet); //adds user inputed data sets
		Receipt.addItems(name); //adds new Item object to invoice object
		}
		System.out.println(Receipt.printInvoice); //prints out invoice total
		
		}
	}
}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
