package pl.kasprowski.webinar3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		int nOne = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczb� pierwsz�"));
		int nTwo = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczb� druga"));
		int nThree = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczb� trzeci�"));
		
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
		
		
		JOptionPane.showMessageDialog(null, "Najwi�ksza liczba to: " + max);
	}

}
