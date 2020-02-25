
import java.util.*;

public class ItemInventory {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the item name");
		int quantity;
		double price;
		String name = input.nextLine();
		String pet;
		do {
			System.out.println("If a pet type Y for yes, if not, type N for no");
			pet = input.nextLine();
			pet = pet.toUpperCase();
		} while(!(pet.compareTo("Y") == 0) || (pet.compareTo("N") == 0));
		
		System.out.println("Please enter the quantity of the item(s)");
		Scanner input2 = new Scanner(System.in);
		quantity = input2.nextInt();
		
		System.out.println("Please enter price of the item");
		Scanner input3 = new Scanner(System.in);
		price = input3.nextDouble();
		
		ItemClass Dogfood = new ItemClass();
		Dogfood.addItems(price, quantity, name, pet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
