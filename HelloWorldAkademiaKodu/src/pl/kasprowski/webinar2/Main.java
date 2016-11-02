package pl.kasprowski.webinar2;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Podaj imiê: ");
		String surname = JOptionPane.showInputDialog("Podaj nazwisko: ");
		JOptionPane.showMessageDialog(null,"Nazywasz siê: " + name + " " + surname);
		char firstLetter = name.charAt(0);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Podaj wiek"));
		
		if (age >= 18){
			JOptionPane.showMessageDialog(null, "Jesteœ pe³noletni");
		}else
			JOptionPane.showMessageDialog(null, "Jesteœ dzieckiem");
	}

}