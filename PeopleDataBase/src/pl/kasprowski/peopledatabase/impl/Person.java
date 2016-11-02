package pl.kasprowski.peopledatabase.impl;

public class Person implements Comparable<Person> {
	private String name;
	private String surname;
	private int age = 0;
	private int height = 0;
	private Double weight = 0.0;

	public Person() {

	}

	public Person(String name, String surname, int age, int height, Double weight) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Surname: " + surname + " Age: " + age + " Height: " + height + " Weight: " + weight;
	}

	@Override
	public int compareTo(Person o) {
		int compare = surname.compareTo(o.surname);
		if (compare == 0) {
			compare = name.compareTo(o.name);
		}
		return compare;
	}

}
