import java.util.ArrayList;

public class InvoiceClass {

	private ArrayList<ItemClass> customerItems;

	public InvoiceClass() {
		customerItems = new ArrayList<ItemClass>();
	}

	public void addItems(ItemClass E) {
		customerItems.add(E);
	}
	
	public void removeItems(int a)
	{
		customerItems.remove(a);
	}
	
	public void clearList()
	{
		for(int i = customerItems.size(); i >= 0; i--)
		{
			customerItems.remove(i);
		}
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
		double discount;
		double nonDisctotal = 0.00;
		int isPet = 0;
		int isItem = 0;
		int totalItems = 0;
		for (ItemClass E : customerItems) {
			if (E.isPet().compareTo("Y") == 0) {
				isPet++;
			} else
				totalItems += E.getQuantity();	
		}
		if (isPet >= 1 && totalItems >= 5) {
			for (ItemClass Item : customerItems) {
				if (Item.isPet() == "Y") {
					petTotal += Item.calculatePrice(Item.getPrice(), Item.getQuantity());
				} else
					itemTotal += Item.calculatePrice(Item.getPrice(), Item.getQuantity());
			}
			itemTotal = itemTotal * 0.8;
			return petTotal + itemTotal;
		} else {
			for (ItemClass price: customerItems) {
				nonDisctotal += price.getPrice();
			}
			return nonDisctotal;
		}
	}

	public ArrayList<String> printInvoice() {
		ArrayList<String> Items = new ArrayList<String>();
		String str = "";
		double grandTotal = 0.00;
		for (ItemClass Item: customerItems) {
			str += Item.getName() + ": " + Item.getQuantity() + ", "
					+ Item.getPrice();
			Items.add(str);
			str = "";
		}
		grandtotal = grandtotal.getDiscount;
		Items.add("Grand Total: " + grandTotal);
			return Items;
		}
	}

}
