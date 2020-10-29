package arraylist;

import java.util.ArrayList;

public class Arrlis {

	static ArrayList<String> bookName = new ArrayList<>();

	public static void main(String[] args) throws NullPointerException {

		System.out.println("hey");

		Lon.strnm();

		System.out.println("Done with exception");

	}

}

class Lon {

	public static void strnm() {
		try {

			throw new NullPointerException();

		} catch (Exception e) {

			System.out.println("Heyheyhey");

		} finally {

			System.out.println("Hi");
		}

	}
}