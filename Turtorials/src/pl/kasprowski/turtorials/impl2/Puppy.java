package pl.kasprowski.turtorials.impl2;

public class Puppy {

	int puppyage;
	
	public Puppy(String name){
		System.out.println("Name chosen is " + name);
		}
	
	public void setAge( int age){
		puppyage = age;
	}
	public int getAge( ){
		System.out.println("Puppy's age is :" + puppyage);
		return puppyage;
	}
	
	public static void main(String[] args) {
		
		Puppy myPuppy = new Puppy("Tommy");
		
		myPuppy.setAge(3);
		
		myPuppy.getAge( );
		
		System.out.println("Variable value :" + myPuppy.puppyage);
	}
}

