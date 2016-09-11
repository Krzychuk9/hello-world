package pl.kasprowski.turtorials.impl16;

import java.io.*;

public class FileStreamTest {
	public static void main(String[] args) {

		try {
			byte[] bWrite = {11, 12, 17, 19, 120};
			FileOutputStream out = new FileOutputStream("test.txt");
			for (int i = 0; i < bWrite.length; i++) {
				out.write(bWrite[i]);
			}
			out.close();

			FileInputStream in = new FileInputStream("test.txt");
			int size = in.available();

			for (int x = 0; x < size; x++) {
				System.out.print((byte) in.read() + " ");
			}
			in.close();
		} catch (IOException e) {
			System.out.println("Exeption");
		}
	}

}
