package pl.kasprowski.turtorials.impl16;

import java.io.*;

public class FileRead {
	public static void main(String[] args) throws IOException {
		File file = new File("hello.txt");
		file.createNewFile();
		
		FileWriter writer = new FileWriter(file);
		writer.write("This\nis\nan\nexample");
		writer.flush();
		writer.close();
		
		FileReader reader = new FileReader(file);
		char[] a = new char[50];
		reader.read(a);
		for (char c : a){
			System.out.print(c);
		}
		reader.close();
	}
}
