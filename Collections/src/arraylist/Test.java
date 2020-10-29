package arraylist;

import java.util.HashMap;

public class Test {

	int i;
	int j;

	public Test(int a, int b) {

		this.i = a;
		this.j = b;

	}

	HashMap<Test, String> hm = new HashMap<Test, String>();

	public void methodTest() {

		Test n = new Test(10, 20);
		Test n1 = new Test(100, 200);
		Test n2 = new Test(1000, 2000);

		hm.put(n, "FirstObject");
		hm.put(n1, "SecondObject");
		hm.put(n2, "ThirdtObject");
		
		System.out.println(hm.put(n2, "LastObject"));
		System.out.println(hm.get(n2));

	}

	public void methodTest(int a, int b) {

		System.out.println(a + b);
	}

	public static void main(String[] args) {

		Test obj=new Test(10, 15);
		
		obj.methodTest();
	}
}
