package pl.kasprowski.turtorials.impl16;

import java.io.*;

public class ByteStreamTest {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);

		while (bOutput.size() != 10) {
			bOutput.write("hello".getBytes());
		}
		byte[] b = bOutput.toByteArray();
		System.out.println("Print the contest: ");

		for (int i = 0; i < b.length; i++) {
			System.out.print((char) b[i] + " ");
		}

		int c;
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		System.out.println("\nConverting characters to Upper Case");

		while ((c = bInput.read()) != -1) {
			System.out.println(Character.toUpperCase((char) c));
		}
		bInput.reset();

	}

}
