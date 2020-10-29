package arraylist;

import java.util.ArrayList;

public class ArrayListtt {

	static ArrayList<Integer> an = new ArrayList<Integer>();

	public static void main(String[] args) {

		an.add(25);
		an.add(30);
		an.add(35);
		an.add(40);
		an.add(45);
		an.add(50);

		for (int i = 0; i < an.size(); i++) {

			if (an.get(i) == 35) {
				an.remove(i);
			}

		}
		System.out.println(an);
	}

}
