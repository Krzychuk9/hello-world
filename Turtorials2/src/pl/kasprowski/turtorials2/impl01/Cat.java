package pl.kasprowski.turtorials2.impl01;

import java.util.Date;

public class Cat {

	private String name;
	private Date birthDayDate = new Date();
	private Double weight = 0.0;
	private String keeperName;

	public String Introduce() {
		return "Name : " + name + " Birth day date: " + birthDayDate + " Weight: " + weight + " Kepper name: " + keeperName;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public void setBirthDayDate(Date birthDayDate) {
		this.birthDayDate = birthDayDate;
	}
	
	public Date getBirthDayDate(){
		return birthDayDate;
	}
	
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	public Double getWeight() {
		return weight;
	}

	public void setKeeperName(String keeperName) {
		this.keeperName = keeperName;
	}

}
