import java.util.Scanner;

public class question1 {
	public static void main (String[] args)
	{
		// Math.PI
		Scanner keyboard = new Scanner(System.in);

		System.out.println("How tall do you want the pyramid");
		int height = keyboard.nextInt();
		int width = ((height-1)) * 2 + 1;
		int middle = height;//(width/2)-1;
		
		System.out.println("Width=" + width + ",Height=" + height+ ",Middle=" + middle );
		System.out.println("");
		System.out.println("Calculating");
		for (int i = 0;i<height;i++)
		{
			String[] pyramid = new String[width];
			pyramid[height-1] = i + 1 + "";
			for (int x = 0;x<middle;x++)
			{
				pyramid[x] = x + 1 + "";
				pyramid[x+middle-1] = middle -x + "";
				//System.out.println(middle-x);
				//pyramid[middle-x] = middle-x + "";
				//pyramid[x] = x + 1 + "";
			}
			//for (int x = middle+1;x<height;x++)
			//{
			//	pyramid[x] = x + 1 + "";
			//	//pyramid[x] = x + 1 + "";
			//}
			for (int x = 0;x<width;x++)
			{
				System.out.printf(" %s", pyramid[x]);
			}
			/*
			for (int x = 0;x<middle;x++)
			{
				pyramid[x] = x + 1 + "";
				pyramid[x] = x + 1 + "";
			}

			*/
			System.out.println("");
			//pyramid[height-1] = i + 1 + "";
			///System.out.println(pyramid[height-1]);
			//for (int j=0;j<width;j++)
			//{
			//}
		}
		

		System.out.println("We are done");
		keyboard.close();
	}
}
