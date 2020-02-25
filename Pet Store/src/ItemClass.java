import java.util.*;

public class ItemClass {

	private double price;
	private int quantity;
	private String name;
	private String pet;

	public ItemClass() {
		price = 0;
		quantity = 0;
		name = "unknown";
		pet = "N";
	}

	public void addItems(double a, int b, String c, String d) {
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
		pet = d;
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

	public String isPet() {
		String Y = "True";
		String N = "False";
		if (pet.compareTo("Y") == 0) {
			return Y;
		} else
			return N;
	}

	public double calculatePrice(double a, int b) {
		return a * b;
	}

	public static void printItem() {
		System.out.println();
	}

}
