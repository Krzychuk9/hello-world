package pl.kasprowski.peopledatabase.impl;

import java.util.*;

public class InPut {
	private String userData;

	private Scanner sc = new Scanner(System.in);

	public String getUserData() {
		return userData;
	}

	public void getData() {
		this.userData = sc.nextLine().trim();
	}

}
