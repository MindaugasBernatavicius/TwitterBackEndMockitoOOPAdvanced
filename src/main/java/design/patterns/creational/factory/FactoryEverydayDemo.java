package design.patterns.creational.factory;

import java.util.Calendar;
import java.util.TimeZone;

public class FactoryEverydayDemo {

	public static void main(String args []) {
		
		Calendar cal = Calendar.getInstance();
        // Calendar cal0 = Calendar.getInstance(TimeZone.getTimeZone(""));
		
		System.out.println(cal);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
	
}
