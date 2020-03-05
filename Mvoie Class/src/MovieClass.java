
public class MovieClass {
	
	String title;
	String Studio;
	String Rating;
	int year;
	public MovieClass()
	{
		String title = "Pending";
		String Studio = "Pending";
		String Rating = "Pending";
		int year = 0000;
	}
	
	public void createMovie(String a, String b, String c, int d)
	{
		String title = a;
		String Studio = b;
		String Rating = c;
		int year = d;
	}
	
	public void setTitle(String a)
	{
		String title = a;
	}
	public void setStudio(String b)
	{
		String Studio = b;
	}
	public void setRating(String c)
	{
		String Rating = c;
	}
	public void setYear(int d)
	{
		int year = d;
	}
	
	public String getTitle()
	{
		return title;
	}
	public String getStudio()
	{
		return Studio;
	}
	public String getRating()
	{
		return Rating;
	}
	public int getYear()
	{
		return year;
	}
	
	public String toString(MovieClass)()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
