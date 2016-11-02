package pl.kasprowski.webinar4;

public class Main {

	public static void main(String[] args) {
		/*Person michal = new Person();
		michal.name = "Micha³";
		michal.surname = "Makaruk";
		michal.age = 13;
		*/
		Person michal = new Person("Micha³", "Makaruk", 13);
		
		
		System.out.println(michal.name + " " + michal.age);
		System.out.println(michal.fullName());
		
		Car myCar = new Car();
		myCar.brand = "BMW";
		myCar.owner = michal;
		System.out.println("W³aœciciel: " + myCar.owner.fullName());
	}

}
