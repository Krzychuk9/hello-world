package pl.kasprowski.webinar2;

import javax.swing.JOptionPane;

public class NameTest {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Podaj imi�: ");
		int length = name.length();
		char lastLetter = name.charAt(length - 1);

		if (lastLetter == 'a') {
			JOptionPane.showMessageDialog(null, "Jeste� kobiet�");
		}else
			JOptionPane.showMessageDialog(null, "Jeste� m�szczyzn�");
	}
}
