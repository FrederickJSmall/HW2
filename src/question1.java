import java.util.Scanner;

public class question1 {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("How tall do you want the pyramid");
		int height = keyboard.nextInt();
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

		System.out.println("We are done");
		keyboard.close();
	}
	public void buildPyramid(int height,int width,int middle)
	{
		String[] pyramid2 = new String[width];
		pyramid2[middle-1] = height + "";
		for (int x = 1;x<middle;x++)
		{
			int value=0;
			String strValue = pyramid2[(middle-1)];
			if (isNumber(strValue))
			{
				value = Integer.parseInt(strValue)-x;
				if (value <0 ) value = 0;
			}
			else 
				value = 0;
			pyramid2[middle-x-1] = value + "";
			pyramid2[middle+x-1] = value + "";
		}
		for (int x = 0;x<width;x++)
		{
			int printValue = Integer.parseInt(pyramid2[x]);
			if (printValue == 0)
				System.out.printf("%3s", " ");
			else
				System.out.printf("%3d", printValue);
		}
		System.out.println("");
	
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
