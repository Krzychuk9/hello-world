package pl.kasprowski.turtorials.impl15;

public class ThisExample {
	private int num = 10;

	ThisExample() {
		System.out.println("This is an example program on keyword this ");
	}

	ThisExample(int num) {
		this();
		this.num = num;
	}

	public void greet() {
		System.out.println("hi");
	}

	public void print() {
		int num = 20;

		System.out.println("value of local variable num is: " + num);

		System.out.println("value of instance variable is: " + this.num);

		this.greet();
	}

	public static void main(String[] args) {
		
		ThisExample obj1 = new ThisExample();
		obj1.print();
		
		ThisExample obj2 = new ThisExample(50);
		obj2.print();
		
		
	}

}
