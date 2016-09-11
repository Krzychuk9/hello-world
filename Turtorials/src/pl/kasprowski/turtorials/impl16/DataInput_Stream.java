package pl.kasprowski.turtorials.impl16;

import java.io.*;

public class DataInput_Stream {
	public static void main(String[] args) throws IOException {

		DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("datastream.txt"));
		
		dataOut.writeUTF("hello");
		
		DataInputStream dataIn = new DataInputStream(new FileInputStream("datastream.txt"));
		
		while (dataIn.available()>0){
			String k = dataIn.readUTF();
			System.out.print(k);
		}
	}

}
