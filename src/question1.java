import java.util.Scanner;

public class question1 {
	public static void main (String[] args)
	{
		// Math.PI
		Scanner keyboard = new Scanner(System.in);

		System.out.println("How tall do you want the pyramid");
		//int height = keyboard.nextInt();
		int height = 3;
		int width = ((height-1)) * 2 + 1;
		int middle = height;//(width/2)-1;
		
		System.out.println("Width=" + width + ",Height=" + height+ ",Middle=" + middle );
		System.out.println("");
		System.out.println("Calculating");
		
		question1 question = new question1();
		for (int i=1;i<=height;i++)
		{
			question.buildPyramid(i);
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
	public void buildPyramid(int height)
	{
		int width = ((height-1)) * 2 + 1;
		int middle = height;//(width/2)-1;
		
		//for (int z=0;z<height;z++)
		//{
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
		//}
		
	}
}
