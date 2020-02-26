import java.util.ArrayList;

public class InvoiceClass {

	private ArrayList<ItemClass> customerItems; //instantiates arraylist

	// Collects all ItemClass objects, uses them to compile data
	
	public InvoiceClass() { //instantiates new arraylist when needed by instantiating an invoice class object
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

	public double getTotal() { //calculates total by going through each item and adding their totals up
		double total = 0.00;
		for (int i = 0; i < customerItems.size(); i++) {
			total += (customerItems.get(i).getPrice()) * (customerItems.get(i).getQuantity());
		}
		return total;
	}

	public double getDiscount() { //finds the total price after discount is applied
		double petTotal = 0;
		double itemTotal = 0;
		double discount;
		double nonDisctotal = 0.00;
		int isPet = 0;
		int isItem = 0;
		int totalItems = 0;
		for (ItemClass E : customerItems) { //goes through each Item 
			if (E.isPet().compareTo("Y") == 0) { //if a pet, adds to isPet count, else, adds totalItems by the Item Quantity and isItem
				isPet++;
			} else
				totalItems += E.getQuantity();
			isItem++;
		}
		if (isPet >= 1 && isItem >= 5) { //compares if isPet is greater than 1 and isItem count is greater than 5
			for (ItemClass Item : customerItems) { //if true, again goes through each Item in the arraylist customerItems
				if (Item.isPet() == "Y") { //if Item is a pet, calculates petTotal, else itemTotal is added to
					petTotal += Item.calculatePrice(Item.getPrice(), Item.getQuantity());
				} else
					itemTotal += Item.calculatePrice(Item.getPrice(), Item.getQuantity());
			}
			itemTotal = itemTotal * 0.8;//calculates discounted figure for item total price only
			return petTotal + itemTotal; //returns discounted itemTotal added to non discounted petTotal
		} else { //if isPet is not equal to 1 and or the total items is not greter than 5, regular price is calculated
			for (ItemClass price: customerItems) {
				nonDisctotal += price.getPrice();
			}
			return nonDisctotal; //returns non discounted total
		}
	}

	public ArrayList<String> printInvoice() {
		ArrayList<String> Items = new ArrayList<String>(); //creates new arraylist
		String str = ""; //instantiates new blank string str
		double grandTotal = 0.00;
		for (ItemClass Item: customerItems) { //goes through each Item in invoice arraylist
			str += Item.getName() + ": " + Item.getQuantity() + ", " //adds item name, quantity, and total price for each Item to str
					+ Item..calculatePrice(Item.getPrice(), Item.getQuantity());
			Items.add(str); //adds str string to arraylist Items
			str = ""; //makes str blank again
		}
		grandtotal = grandtotal.getDiscount; //calls discount method on grandtotal
		Items.add("Grand Total: " + grandTotal); //adds concatanated string to end of Items arraylist
			return Items;// returns Items arraylist of Item object strings with grandtotal summation at the end
		}
	}


