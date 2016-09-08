package pl.kasprowski.turtorials.impl14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main(String[] args) {

		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d{3})(.*)";
		String REGEX = "\\bcat\\b";
		String INPUT = "cat cat cat cattie cat";
		int count = 0;
		final String REGEX2 = "fooo";
		final String INPUT2 = "foooooo";
		final String REPLACE = "dog";
		String REGEX3 = "a*b";
		String INPUT3 = "aabfoooaabfooabfoob";
		String REPLACE3 = "-";
		
		
		Pattern p = Pattern.compile(pattern);
		Pattern p2 = Pattern.compile(REGEX);
		Pattern p3 = Pattern.compile(REGEX2);
		Pattern p4 = Pattern.compile(REGEX3);
				
		Matcher m = p.matcher(line);
		Matcher m2 = p2.matcher(INPUT);
		Matcher m3 = p3.matcher(INPUT2);
		Matcher m4 = p4.matcher(INPUT3);
		
		StringBuffer sb = new StringBuffer();
		
		
		if (m.find()) {
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
			System.out.println("Found value: " + m.group(3));

		} else {
			System.out.println("NO MATCH");
		}
		
		while (m2.find()) {
			count++;
			System.out.println("Match number " + count);
			System.out.println("Start: " + m2.start());
			System.out.println("end: : " + m2.end());
		}
		
		System.out.println("lookingAt: " + m3.lookingAt());
		System.out.println("matches: " + m3.matches());
		
		INPUT = m2.replaceFirst(REPLACE);
		System.out.println(INPUT);
		
		while(m4.find()) {
			m4.appendReplacement(sb, REPLACE3);
		}
		m2.appendTail(sb);
		System.out.println(sb.toString());
	}

}
