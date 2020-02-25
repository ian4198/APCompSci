
public class ReceiptProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println ("Subtotal:");
		System.out.println ((38+40+30) + "$");
		double subtotal;
		subtotal = 108; 
		System.out.println ("Tax:");
		System.out.println ((subtotal*.0635) + "$");
		double tax;
		tax = (subtotal*.0635);
		System.out.println ("Tip:");
		System.out.println ((subtotal*.15) + "$");
		double tip;
		tip = (subtotal*.15);
		System.out.println ("Total:");
		System.out.println ((subtotal + tax + tip) + "$");
																
			
	}

}
