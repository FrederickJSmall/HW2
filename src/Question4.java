/*
 * Frederick Small
 * CISC 3150
 * HW 2
 * 
 */
public class Question4 {
	public static void main (String[] args)
	{
		Outter:
		for (int outer=1;outer<=1000;outer++)
		{
			System.out.println("**** Outer="+outer);
			Inner:
			for (int inner=1;inner<=1000;inner++)
			{
				System.out.println("     Inner="+inner);
				if (inner == 5)
				{
					System.out.println("     Breaking inner");
					System.out.println("");
					break Inner;
				}
				if (outer == 10)
				{
					System.out.println("     Breaking outter");
					break Outter;
				}
			}
			
		}
		System.out.println("We are done");
	}
}
