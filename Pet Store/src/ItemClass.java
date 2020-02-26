import java.util.*;

public class ItemClass {

	private double price; //instantiates variables
	private int quantity;
	private String name;
	private String pet;

	public ItemClass() { //instantiates ItemClass constructor
		price = 0;
		quantity = 0;
		name = "unknown";
		pet = "N";
	}

	public void addItems(double a, int b, String c, String d) { //method for adding variables
		price = a;
		quantity = b;
		name = c;
		pet = d;
	}

	public void setPrice(double a) {
		price = a;
	}

	public void setQuantity(int b) {
		quantity = b;
	}

	public void setName(String c) {
		name = c;
	}

	public void setPet(String d) {
		pet = d.toUpperCase();
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getName() {
		return name;
	}

	public String isPet() { //method to ask if Item is pet
		String Y = "True";
		String N = "False";
		if (pet.compareTo("Y") == 0) {
			return Y; //returns Y for yes if pet
		} else
			return N; //returns N for no if not pet
	}

	public double calculatePrice(double a, int b) { //method for finding price
		return a * b;
	}

	public static void printItem() { //prints Item object 
		System.out.println();
	}

}
