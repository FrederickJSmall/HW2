import java.util.Scanner;

public class question1 {
	public static void main (String[] args)
	{
		// Math.PI
		Scanner keyboard = new Scanner(System.in);

		System.out.println("How tall do you want the pyramid");
		int height = keyboard.nextInt();
		//int height = 5;
		int width = ((height-1)) * 2 + 1;
		int middle = height;//(width/2)-1;
		
		System.out.println("Width=" + width + ",Height=" + height+ ",Middle=" + middle );
		System.out.println("");
		System.out.println("Calculating");
		
		question1 question = new question1();
		for (int i=1;i<=height;i++)
		{
			question.buildPyramid(i,width,middle);
		}
		/*
		for (int z=0;z<height;z++)
		{
		String[] pyramid2 = new String[width];
		pyramid2[height-1] = 0 + 1 + "";
		for (int x = 0;x<middle;x++)
		{
			pyramid2[x] = x + 1 + "";
			pyramid2[x+middle-1] = middle -x + "";
		}
		for (int x = 0;x<width;x++)
		{
			System.out.printf(" %s", pyramid2[x]);
		}
		System.out.println("");
		}
		*/
		/*
		for (int i = 0;i<height;i++)
		{
			String[] pyramid = new String[width];
			pyramid[height-1] = i + 1 + "";
			for (int x = 0;x<middle;x++)
			{
				pyramid[x] = x + 1 + "";
				pyramid[x+middle-1] = middle -x + "";
			}

			//print row
			for (int x = 0;x<width;x++)
			{
				
				System.out.printf(" %s", pyramid[x]);
			}

			System.out.println("");
		}
		*/

		System.out.println("We are done");
		keyboard.close();
	}
	public void buildPyramid(int height,int width,int middle)
	{
		//int width = ((height-1)) * 2 + 1;
		//int middle = height;//(width/2)-1;
		
		//for (int z=0;z<height;z++)
		//{
		String[] pyramid2 = new String[width];
		pyramid2[middle-1] = height + "";
		for (int x = 1;x<middle;x++)
		{
			//pyramid2[x] = x + 1 + "";
			//pyramid2[x+middle-1] = middle -x + "";
			//String x2 = pyramid2[(middle-x)-1];
			int value=0;
			String strValue = pyramid2[(middle-1)];
			if (isNumber(strValue))
			{
				value = Integer.parseInt(strValue)-x;
				//System.out.println(value);
				if (value <0 ) value = 0;
			}
			else 
				value = 0;
			//String value = pyramid2[(middle-x)-1];

			
			//int value = 0;
			//try
			//{
			//  value = Integer.parseInt(pyramid2[(middle-x)-1])-1;
			//}
			//catch (Exception ex)
			//{
			//	value = 0;
			//}
			
			pyramid2[middle-x-1] = value + "";
			pyramid2[middle+x-1] = value + "";
		}
		//for (int x = 0;x<width;x++)
		//{
		//	System.out.printf(" %s", pyramid2[x]);
		//}
		for (int x = 0;x<width;x++)
		{
			int printValue = Integer.parseInt(pyramid2[x]);
			if (printValue == 0)
				//System.out.printf(" %s", " ");
				System.out.printf("%s", "   ");
			else
				//System.out.printf(" %s", pyramid2[x]);
				System.out.printf("%3d", printValue);
		}
		System.out.println("");
		//}
		
	}
	private static boolean isNumber(String value) {
	    try {
	        Integer.parseInt(value);
	        return true;
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	}
}
