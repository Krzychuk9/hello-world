package pl.kasprowski.webinar3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		int nOne = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbê pierwsz¹"));
		int nTwo = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbê druga"));
		int nThree = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbê trzeci¹"));
		
		int max = nOne;
		
		/*if (max < nTwo){
			max = nTwo;
		}
		if (max < nThree){
			max = nThree;
		}
		*/
		max = Integer.max(nOne, nTwo);
		max = Integer.max(max, nThree);
		
		
		JOptionPane.showMessageDialog(null, "Najwiêksza liczba to: " + max);
	}

}
