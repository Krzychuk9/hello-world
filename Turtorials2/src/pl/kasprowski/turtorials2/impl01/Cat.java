package pl.kasprowski.turtorials2.impl01;

import java.util.Date;

public class Cat {

	private String name;
	private Date birthDayDate = new Date();
	private Double weight;
	private String keeperName;

	public String Introduce() {
		return name + birthDayDate + weight + keeperName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthDayDate(Date birthDayDate) {
		this.birthDayDate = birthDayDate;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void setKeeperName(String keeperName) {
		this.keeperName = keeperName;
	}

}
