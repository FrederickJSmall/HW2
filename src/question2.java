import java.util.Calendar;
//import java.util.GregorianCalendar;
import java.util.Scanner;

public class question2 {
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

	    Calendar cal = Calendar.getInstance();
	    cal.set(2015, Calendar.JANUARY, 1, 1, 1, 1);
	    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	    System.out.println(getDayString(dayOfWeek));
	    

		keyboard.close();
	}
	  public static final String getDayString(int day) {
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
}
