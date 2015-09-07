import java.util.Calendar;
//import java.util.GregorianCalendar;
import java.util.Scanner;

public class question2 {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		question2 question = new question2();
		
		int year = 2015;
		
	    Calendar cal = Calendar.getInstance();
	    cal.set(2015, Calendar.JANUARY, 1, 1, 1, 1);
	    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	    System.out.printf("The first of January falls on a %s in %d\n",question.getDayString(dayOfWeek),year);
	    System.out.printf("The first Sunday of %d is January %d\n",year,question.getFirstSundayOfYear(year));
	    System.out.println("");
	    question.displayCalendar(year);
		keyboard.close();
		question = null;
	}
	public String getDayString(int day) {
		    switch (day) {
		      case Calendar.SUNDAY:
		        return "SUNDAY";      
		      case Calendar.MONDAY:
		        return "MONDAY";
		      case Calendar.TUESDAY:
		        return "TUESDAY";
		      case Calendar.WEDNESDAY:
		        return "WEDNESDAY";
		      case Calendar.THURSDAY:
		        return "THURSDAY";
		      case Calendar.FRIDAY:
		        return "FRIDAY";
		      case Calendar.SATURDAY:
		        return "SATURDAY";
		    }
		    return "";
	}
	public String getMonthString(int day) {
	    switch (day) {
	      case Calendar.JANUARY:
	        return "JANUARY";      
	      case Calendar.FEBRUARY:
	        return "FEBRUARY";
	      case Calendar.MARCH:
	        return "MARCH";
	      case Calendar.APRIL:
	        return "APRIL";
	      case Calendar.MAY:
	        return "MAY";
	      case Calendar.JUNE:
	        return "JUNE";
	      case Calendar.JULY:
	        return "JULY";
	      case Calendar.AUGUST:
	        return "AUGUST";
	      case Calendar.SEPTEMBER:
	        return "SEPTEMBER";
	      case Calendar.OCTOBER:
	        return "OCTOBER";
	      case Calendar.NOVEMBER:
	        return "NOVEMBER";
	      case Calendar.DECEMBER:
	        return "DECEMBER";

	    }
	    return "";
}
	public int getFirstSundayOfYear(int year) {
	    Calendar cal = Calendar.getInstance();
	    int dayOfWeek =0;
	    boolean process = true;
	    //String dayName = "";
	    int date = 1;
	   do
	   { 
		   //dayName = getDayString(dayOfWeek);
		   cal.set(year, Calendar.JANUARY, date, 1, 1, 1);
		   dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		   if (dayOfWeek == Calendar.SUNDAY)
			  process = false;
		   else
  			  date++;
	   }
	   while (process==true);
	   return date;
	}
	public void displayCalendar(int year) {
	   //Calendar cal = Calendar.getInstance();
	   //int dayOfWeek =0;
	   //boolean process = true;
		int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	    for (int i=0;i<12;i++)
	    {
	    	System.out.println("");
	    	System.out.printf("%s %d\n",getMonthString(i),year);
	    	System.out.printf(" Su Mo Tu We Th Fr Sa\n");
	    	int days = daysInMonth[i];
	    	int daysOnRow=0;
	    	for (int day=1;day<=days;day++)
	    	{
	    		if (daysOnRow==7)
	    		{
	    			System.out.println("");
	    			daysOnRow=0;
	    		}
	    		System.out.printf("%3d",day);
	    		daysOnRow++;
	    	}
	    	System.out.println("");
	    }
	   
	    
	   
	   
	   //return date;
	}	
}
