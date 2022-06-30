package interviewquestions.com;

import java.util.Calendar;

public class FibonacciCalc {
	public static void main(String[] args) {
		
	}

	public static boolean isLeapYear(int year) {
		Calendar cal= Calendar.getInstance();
		cal.set(Calendar.YEAR,year);
		int noOfDays=cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		if (noOfDays>365) {
			return true;
			
		}
		
		return false;
		
	}
	
}
