package pl.kasprowski.turtorials.impl13;

import java.util.*;
import java.text.*;


public class DateAndTimeClass {

	public static void main(String[] args) {
		Date date = new Date();
		String str = String.format("Current Date/Time : %tc", date); //formatowanie przy pomocy printf
		String input = args.length == 0 ? "1818-11-11" : args [0]; //???????
		Date t;
		
		System.out.println(date.toString());
		
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz"); //wprowadza dowolny uk³ad wyswietlania daty i godziny
		SimpleDateFormat ft2 = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Current Date: " + ft.format(date));
		
		System.out.printf(str);
		
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "\nDue date:", date); //1$ okresla co ma byc sformatowanie
		System.out.printf("%s %tB %<td, %<tY", "\nDue date:", date);
		
		System.out.print("\n" + input + " Parses as ");
		
		try {
			t = ft2.parse(input);
			System.out.println(t);
		}catch (ParseException e) {
			System.out.println("Unparseable using" + ft2);
		}
	}	
}
