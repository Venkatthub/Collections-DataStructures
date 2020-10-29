package tasks.arraylist;

import java.util.ArrayList;

public class ArrayListToArray {

// ArrayList to hold types of vegetables
	static ArrayList<String> veges = new ArrayList<>();
	 int itemm;

	public static void main(String[] args) {

		for (String vegetable : vegetables()) {
			veges.add(vegetable);
		}

		System.out.println(veges);

		String[] vegetableArray = new String[veges.size()];
		veges.toArray(vegetableArray);

		String[] vegetableArray1 = new String[veges.size()];

//		To Array inbuilt method to convert 
		veges.toArray(vegetableArray1);

	}

	public static String[] vegetables() {

		return new String[] { "Carrot", "Tomoto", "Brinjal", "Onion", "Potato", "Capsicum", "Drumstick",
				"BitterGourd" };

	}

}

class test extends ArrayListToArray {

	

	public void methodTest() {
		System.out.println("testMethod in child");
	}

}

class Onlyin {
	
	test obj= new test();
	
	public void meethoone() {
		
		obj.itemm=20;

	}
	
	
}