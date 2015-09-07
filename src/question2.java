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
	    //System.out.println(question.getDayString(dayOfWeek));
	    System.out.printf("The first sunday of %d is January %d",year,question.getFirstSundayOfYear(year));
	
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
}
