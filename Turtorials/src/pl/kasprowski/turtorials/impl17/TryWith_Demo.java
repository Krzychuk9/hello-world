package pl.kasprowski.turtorials.impl17;

import java.io.*;

public class TryWith_Demo {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("file.txt")){
			char[] a = new char[50];
			fr.read(a);
			for (char c : a)
				System.out.print(c);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
