public class question4 {
	public static void main (String[] args)
	{
		GetOut:
		for (int outer=1;outer<=1000;outer++)
		{
			for (int inner=1;inner<=1000;inner++)
			{
				System.out.println(inner);
				if (inner == 100)
					break GetOut;
			}
			
		}
	}
}
