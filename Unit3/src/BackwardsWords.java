import java.util.Scanner; 
public class BackwardsWords
{

	public static void main(String[] args) {
		
		System.out.println("Please enter a word that is no more than 10 letters");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		String newWord = ("");
		while (word.length() > 10)
		{
			System.out.println("Word exceeds length, please re-enter");
			input = new Scanner(System.in);
			word = input.nextLine();
		}
		
		for (int i = 0; i < word.length(); i++)
		{
			int z = i + 1;
			String A = word.substring(i,z);
			newWord = (newWord + A);
		}
		System.out.println(newWord);
}
}
