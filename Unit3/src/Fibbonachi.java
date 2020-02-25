import java.util.*;

public class Fibbonachi {

	public static void main(String[] args) {
		
		System.out.println("Please enter how many times the sequence will commence");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int x = 0;
		int y = 0;
		
		for (int i= 0; i < n; i++)
		{
			if (x == 0)
			{
				System.out.println(0 + " ");
				System.out.println(1 + " ");
				x++;
			}
	
			else
			{
				int temp = x;
				x = x + y;
				System.out.println(x + " ");
				y = temp;
			}
		}
		
		
		

	}

}
