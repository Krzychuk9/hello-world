package pl.kasprowski.turtorials.impl16;

import java.io.*;

public class File_test {

	public static void main(String[] args) {
		File f = null;
		String[] strs = { "test.txt", "test2.txt" };
		
		try {
			for (String s:strs){
			f = new File(s);
			
			boolean bool = f.canExecute();
			String a = f.getAbsolutePath();
			
			System.out.print(a);
			System.out.println(" is executable: " + bool);
			}		
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
