package tasks.arraylist.array_to_arraylist;

import java.util.*;

// converting from Array to ArrayList

public class VegetablesList {

	private ArrayList<String> vegetables = new ArrayList<>();

//	Method 1: Adding vegetables to the array using as list method
	public List<String> addVeges(String[] veges) {

		List<String> veg = Arrays.asList(veges);

		vegetables.addAll(veg);
		
		return vegetables;
		
	}

// 	Method 2: Adding vegetables to the array using as for each loop
//	public void addVege(String[] veges) {
//
//		for (String veg : veges) {
//
//			vegetables.add(veg);
//
//		}
//
//	}

//	To get the list of vegetables
	public List<String> getList() {

		return vegetables;

	}

}
