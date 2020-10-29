package tasks.arraylist;

import java.util.ArrayList;

// Sort ArrayList without using sort method

public class SortArrayList {

	// ArrayList to hold types of vegetables
	static ArrayList<Integer> rollNo = new ArrayList<>();

	public static void main(String[] args) {

		for (Integer num : vegetables()) {
			rollNo.add(num);
		}
		System.out.println(rollNo);
		sortArrayList();

		System.out.println(rollNo);

	}

//	Method to sort ArrayList
//	Bubble Sort algorithm
//	Descending sort
	public static void sortArrayList() {

		for (int i = 0; i < rollNo.size(); i++) {
			for (int j = 0; j < rollNo.size(); j++) {
				if (rollNo.get(i) > rollNo.get(j)) {
					int temp = rollNo.get(i);
					rollNo.set(i, rollNo.get(j));
					rollNo.set(j, temp);
				}
			}
		}

	}

	public static int[] vegetables() {

		return new int[] { 10, 20, 1, 64, 35, 101, 99, 7 };

	}
}
