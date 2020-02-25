
public class AvgHighTemp {
	//--------------------------------------------------------------
	public static double avgTemp(int[] dayTemps)
	{
		double x = 0;
		for (int i = 0; i < dayTemps.length; i++)
		{
			x += dayTemps[i];
		}
		
		x = x/(double)dayTemps.length;
		
		return x;
	}
	//--------------------------------------------------------------
	public static int maxTemp(int[] dayTemps)
	{
		int x = dayTemps[0];
		for (int i = 0; i < dayTemps.length; i++)
		{
			if (dayTemps[i] > x)
			{
				x = dayTemps[i];
			}
		}
		return x;
	}
	//--------------------------------------------------------------
	public static int minTemp(int[] dayTemps)
	{
		int x = dayTemps[0];
		for (int i = 0; i < dayTemps.length; i++)
		{
			if (dayTemps[i] < x)
			{
				x = dayTemps[i];
			}
		}
		return x;
	}
	//--------------------------------------------------------------
	public static double numDaysAboveAvgTemp(int[] dayTemps)
	{
		int z = 0;
		double x = 0;
		for (int i = 0; i < dayTemps.length; i++)
		{
			x += dayTemps[i];
		}
		
		x = x/(double)dayTemps.length;
		
		for (int i = 0; i < dayTemps.length; i++)
		{
			if (dayTemps[i] > x)
			{
				z++;
			}
		}
		
		return z;
	}
}
