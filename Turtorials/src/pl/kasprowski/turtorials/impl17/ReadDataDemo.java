package pl.kasprowski.turtorials.impl17;

import java.io.*;

public class ReadDataDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter wr = null;
		
		try{
		File file1 = new File("file.txt");
		file1.createNewFile();
		char[] x = {'1', '2', 'x', 'y', 'z'};
		wr = new FileWriter(file1);
		wr.write(x);
		wr.flush();
		wr.close();
		}catch(IOException e2){
			e2.printStackTrace();
		}
		
		
		
		try{
			File file = new File("file1.txt");
			fr = new FileReader (file);
			char[] a = new char[50];
			fr.read(a);
			for (char c : a)
				System.out.print(c);
		}catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				fr.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
	
}
