/*
 * Frederick Small
 * CISC 3150
 * HW 2
 * 
 */
import java.util.Scanner;

public class Question3 {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Palindrome checker");
		System.out.println("Enter a word and i will check to see if it is a plaindrome");		
		String word = keyboard.nextLine();
		//String word = "madam";

		System.out.printf("Checking %s",word);
		System.out.println("");

		
		Question3 question = new Question3();
		String reverseWord = question.reverse(word);
		
		if (word.toLowerCase().equals(reverseWord.toLowerCase()))
			System.out.printf("Congratulations %s is a palindrome",word);
		else
		{
			System.out.printf("Sorry %s is not a palindrome. Please try again\n",word);
			System.out.printf("Backwards its %s\n",reverseWord);
		}

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
