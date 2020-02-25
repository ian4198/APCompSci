import java.util.ArrayList;

public class InvoiceClass {

	private ArrayList<ItemClass> customerItems;

	public InvoiceClass() {
		customerItems = new ArrayList<ItemClass>();
	}

	public void addItems(ItemClass E) {
		customerItems.add(E);
	}

	public double getTotal() {
		double total = 0.00;
		for (int i = 0; i < customerItems.size(); i++) {
			total += (customerItems.get(i).getPrice()) * (customerItems.get(i).getQuantity());
		}
		return total;
	}

	public double getDiscount() {
		double petTotal = 0;
		double itemTotal = 0;
		double grandTotal = 0;
		double discount;
		int isPet = 0;
		int isItem = 0;
		int totalItems = 0;
		for (ItemClass E : customerItems) {
			if (E.isPet().compareTo("Y") == 0) {
				isPet++;
			} else
				totalItems += E.getQuantity();
			if (E.isPet().compareTo("Y") != 0) {
				isItem++;
			}
		}
		if (isPet >= 1 && isItem >= 5) {
			for (ItemClass Item : customerItems) {
				if (Item.isPet() == "Y") {
					petTotal += Item.calculatePrice(Item.getPrice(), Item.getQuantity());
				} else
					itemTotal += Item.calculatePrice(Item.getPrice(), Item.getQuantity());
			}
			itemTotal = itemTotal * 0.8;
			return petTotal + itemTotal;
		} else {
			double total = 0.00;
			for (int i = 0; i < customerItems.size(); i++) {
				total += (customerItems.get(i).getPrice()) * (customerItems.get(i).getQuantity());
			}
			return total;
		}
	}

	public ArrayList<String> printInvoice() {
		ArrayList<String> Items = new ArrayList<String>();
		String str = "";
		int b;
		for (int i = 0; i < customerItems.size(); i++) {
			b = i;
			str += customerItems.get(i).getName() + ": " + customerItems.get(i).getQuantity() + ", "
					+ customerItems.get(i).getPrice();
			str = "";
			Items.add(str);
		}

		double petTotal = 0;
		double itemTotal = 0;
		double grandTotal = 0;
		double discount;
		int isPet = 0;
		int isItem = 0;
		int totalItems = 0;
		for (ItemClass E : customerItems) {
			if (E.isPet().compareTo("Y") == 0) {
				isPet++;
			} else
				totalItems += E.getQuantity();
			if (E.isPet().compareTo("Y") != 0) {
				isItem++;
			}
		}
		if (isPet >= 1 && isItem >= 5) {
			for (ItemClass Item : customerItems) {
				if (Item.isPet() == "Y") {
					petTotal += Item.calculatePrice(Item.getPrice(), Item.getQuantity());
				} else
					itemTotal += Item.calculatePrice(Item.getPrice(), Item.getQuantity());
			}
			itemTotal = itemTotal * 0.8;
			grandTotal = petTotal + itemTotal;
			Items.add("Grand Total: " + grandTotal);
			return Items;
		} else {
			double total = 0.00;
			for (int i = 0; i < customerItems.size(); i++) {
				total += (customerItems.get(i).getPrice()) * (customerItems.get(i).getQuantity());
			}
			Items.add("Grand Total: " + total);
			return Items;
		}
	}

}
