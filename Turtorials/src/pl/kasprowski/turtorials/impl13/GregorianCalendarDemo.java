package pl.kasprowski.turtorials.impl13;

import java.util.*;

public class GregorianCalendarDemo {

	public static void main(String[] args) {
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		GregorianCalendar gcalendar = new GregorianCalendar();
		int year = gcalendar.get(Calendar.YEAR);
		
		System.out.print("Date: ");
		System.out.print(months [gcalendar.get(Calendar.MONTH)] + " ");
		System.out.print(gcalendar.get(Calendar.DATE) + " ");
		System.out.print(gcalendar.get(Calendar.YEAR) + "\n");;
		System.out.print("Time: ");
		System.out.print(gcalendar.get(Calendar.HOUR) + ":");
		System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
		System.out.print(gcalendar.get(Calendar.SECOND) + "\n");
		
		if(gcalendar.isLeapYear(year)){
			System.out.print("The current year " + year + " is a leap year.");
		}else {
			System.out.print("The current year is not a leap year");
		}
	}
}
