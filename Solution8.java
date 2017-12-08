import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class Solution8 {
	
	@SuppressWarnings("deprecation")
	public static String getDay(String day, String month, String year)  {
        /*
        * Write your code here.
        */
		String dateString = month+"/"+day+"/"+year;
		SimpleDateFormat spf = new SimpleDateFormat("MM/dd/yyyy");
		Date newDate;
		try {
			newDate = spf.parse(dateString);
			System.out.println("This is the  day we are getting:::"+newDate.getDay());
			int day2 = newDate.getDay();
			if(day2 == 1)
				return "MONDAY";
			if(day2 == 2)
				return "TUESDAY";
			if(day2 == 3)
				return "WEDNESDAY";
			if(day2 == 4)
				return "THURSDAY";
			if(day2 == 5)
				return "FRIDAY";
			if(day2 == 6)
				return "SATURDAY";
			if(day2 == 0)
				return "SUNDAY";
			ArrayList<String> listnew = new ArrayList<>();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
        in.close();
	}
}
