import java.util.Scanner;

public class Question3 {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Palindrome checker");
		System.out.println("Enter a word and i will check to see if it is a plaindrome");		
		String word = keyboard.nextLine();
		//String word = "madam";

		System.out.println("Checking word");
		System.out.println("");

		
		Question3 question = new Question3();
		String reverseWord = question.reverse(word);
		
		if (word.equals(reverseWord))
			System.out.println("Congratulations word is a palindrome");
		else
			System.out.println("Sorry word is not a palindrome. Please try again");
		
		question = null;
		keyboard.close();
	}
	public String reverse(String word)
	{
		StringBuffer buffer = new StringBuffer();
		for (int i=word.length();i>0;i--)
		{
			
			buffer.append(word.substring(i-1,i));
		}
		return buffer.toString();
	}
}
