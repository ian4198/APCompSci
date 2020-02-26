import java.util.*;
public class DDArray {

	public static void main(String[] args) {
	
		System.out.println("Please eneter the number of rows");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		System.out.println("Please eneter the number of columns");
		Scanner input2 = new Scanner(System.in);
		int column = input2.nextInt();
		int [][] table = new int [row][column];
		for(int i = 0; i < table.length; i++)
		{
			for(int j = 0; j < table[0].length; j++)
			{
				table[i][j] = (i+1)*(j+1);
			}
		}
	
		for(int i = 0; i < table.length; i++)
		{
			for(int j = 0; j < table[0].length; j++)
			{
				
			}
		}
		
	}

}
