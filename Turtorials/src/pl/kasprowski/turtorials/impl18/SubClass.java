package pl.kasprowski.turtorials.impl18;

public class SubClass extends SuperClass {

	SubClass(int age) {
		super(age);
	}
	
	public static void main(String[] args) {
		SubClass s = new SubClass (24);
		s.getAge();
	}
}
