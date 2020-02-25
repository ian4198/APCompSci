import java.util.*;
public class Array {

	public static void main(String[] args) {
	
		System.out.println("Please enter a minimum vaule");
		Scanner inputmin = new Scanner(System.in);
		int min = inputmin.nextInt();
		System.out.println("Please enter a maximum vaule");
		Scanner inputmax = new Scanner(System.in);
		int max = inputmax.nextInt();
		int z = 0;
		
		if (min < max)
		{
			if ((min-max) % 2 == 0)
			{
				int[] nums = new int[(max-min)/2];
				for (int i = min; i <= max; i++)
				{
					if (i % 2 != 0)
					{
						nums[z] = i;
						z++;
					}
					
				}
				System.out.println(Arrays.toString(nums));
			}
			else
			{
				
			int[] nums = new int[(max-min+1)/2];		
							
			for (int i = min; i <= max; i++)
			{
				if (i % 2 != 0)
				{
					nums[z] = i;
					z++;
				}
				
			}
			System.out.println(Arrays.toString(nums));
			}
		}
		else 
			System.out.println("ERROR_MINGREATERTHANMAX");
		
		

	}

}
