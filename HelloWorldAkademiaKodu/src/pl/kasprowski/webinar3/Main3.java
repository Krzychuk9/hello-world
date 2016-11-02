package pl.kasprowski.webinar3;

public class Main3 {
	public static void main(String[] args) {
		String[] friends = new String[4];
		friends[0] = "Adam";
		friends[1] = "karol";
		friends[2] = "ania";
		friends[3] = "elo";
			
		System.out.println(friends[0]);
	
		for (String elements : friends){
			System.out.println(elements);
		}
	}
}
