package tasks.arraylist;

import java.util.ArrayList;

//program to convert array to ArrayList

public class ArraytoArrayList {

	// ArrayList to hold types of vegetables
	static ArrayList<String> veges = new ArrayList<String>();

	public static void main(String[] args) {

		for (String vegetable : vegetables()) {
			veges.add(vegetable);
		}

		System.out.println(veges);
	}

	public static String[] vegetables() {

		return new String[] { "Carrot", "Tomoto", "Brinjal", "Onion", "Potato", "Capsicum", "Drumstick",
				"BitterGourd" };

	}

}
