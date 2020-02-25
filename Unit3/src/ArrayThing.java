import java.util.Arrays;
import java.util.Scanner;

public class ArrayThing {

	public static void main(String[] args) {
		int[] temp = new int[7];
		int getTemp = 0;
		int i = 0;
		Scanner input = new Scanner(System.in);
		
		while (getTemp != -200)
		{
			System.out.println("Enter a temperature.  Enter -200 when done: ");
			getTemp = input.nextInt();
			input.nextLine();
			if (i < temp.length)
			{
				temp[i] = getTemp;
				i++;
			}
			else
			{
				int[] newtemp = new int[i+10];
				for(int x = 0; x < temp.length; x++)
				{
					newtemp[x] = temp[x];
				}
				newtemp[i++] = getTemp;
				temp = newtemp;
			}
		}
		System.out.println(Arrays.toString(temp));
		
	}
}