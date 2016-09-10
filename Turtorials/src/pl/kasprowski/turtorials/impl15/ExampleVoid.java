package pl.kasprowski.turtorials.impl15;

public class ExampleVoid {

	public static void main(String[] args) {
		
		methodRankPoints(10.44);
		
	}
	public static void methodRankPoints(double points){
		if(points >= 202.5){
			System.out.println("Rank: A1");
		}
		else if(points >= 112.4){
			System.out.println("Rank: A2");
		}
		else{
			System.out.println("Rank: A3");
		}
	}
	
}
