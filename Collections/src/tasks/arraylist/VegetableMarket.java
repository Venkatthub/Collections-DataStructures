package tasks.arraylist;

import tasks.arraylist.array_to_arraylist.VegetablesList;

// VegetableMarket class to maintain the list of vegetables available

public class VegetableMarket {

	public static void main(String[] args) {

		VegetablesList list = new VegetablesList();

		list.addVeges(vegetableArray());

		System.out.println(list.getList());

	}

//	Array of vegetables available in the market
	public static String[] vegetableArray() {

		return new String[] { "Carrot", "Tomoto", "Brinjal", "Onion", "Potato", "Capsicum", "Drumstick",
				"BitterGourd" };

	}

}
