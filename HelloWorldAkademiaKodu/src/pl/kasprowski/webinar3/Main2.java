package pl.kasprowski.webinar3;

import java.util.stream.IntStream;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class Main2 {
	public static void main(String[] args) {
		String password;
		
		do
		password = JOptionPane.showInputDialog("Podaj has�o: ");
				
		while(!password.equals("AkademiaKodu"));
		JOptionPane.showMessageDialog(null, "Has�o poprawne");
		
		
		for (int i = 2; i < 51; i++){
			System.out.println(i);
			
			IntStream.rangeClosed(2, 50).forEach(System.out::println);
		}
	}
}
