package pl.kasprowski.helloworldakademiakodu;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;



public class DictionaryExample {

	public static void main(String[] args) {
		Map<String, String> dictionary = new HashMap<String, String>();

		dictionary.put("witam", "hello");
		dictionary.put("kot", "cat");
		dictionary.put("pies", "dog");
		dictionary.put("tata", "father");
	
		String word = JOptionPane.showInputDialog("Podaj s³owo po polsku");
		
		if (dictionary.containsKey(word)){
			JOptionPane.showMessageDialog(null,"S³owo po Angielsku to: " +  dictionary.get(word));
		}else{
			JOptionPane.showMessageDialog(null, "Nie znaleziono s³owa");
		}
		
		
	}

}
