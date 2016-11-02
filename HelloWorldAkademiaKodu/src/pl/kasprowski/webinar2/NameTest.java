package pl.kasprowski.webinar2;

import javax.swing.JOptionPane;

public class NameTest {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Podaj imiê: ");
		int length = name.length();
		char lastLetter = name.charAt(length - 1);

		if (lastLetter == 'a') {
			JOptionPane.showMessageDialog(null, "Jesteœ kobiet¹");
		}else
			JOptionPane.showMessageDialog(null, "Jesteœ mê¿szczyzn¹");
	}
}
