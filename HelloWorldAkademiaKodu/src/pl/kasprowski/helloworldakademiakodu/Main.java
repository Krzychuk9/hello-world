package pl.kasprowski.helloworldakademiakodu;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int numberOfFriends = 550;
		String name = "Micha³";

		int age = Integer.parseInt(JOptionPane.showInputDialog("Podaj wiek"));

		JOptionPane.showMessageDialog(null, "HELLO WORLD " + name);

		if (age >= 18) {
			JOptionPane.showMessageDialog(null, "Jesteœ pe³noletni");
		} else {
			JOptionPane.showMessageDialog(null, "Jesteœ dzieckiem");
		}
	}

}
