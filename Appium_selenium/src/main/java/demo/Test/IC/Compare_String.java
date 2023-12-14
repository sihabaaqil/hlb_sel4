package demo.Test.IC;

public class Compare_String {

	public static void main(String[] args) {
		String[] strAr2 = { "Ani", "Sam", "Joe" };

		for (int i = 0; i <= strAr2.length - 1; i++) {
			if (strAr2[i].equalsIgnoreCase(strAr2[1])) {
				System.out.println("" + strAr2[i]);
			}

			if (strAr2[i] == (strAr2[1])) {
				System.out.println("" + strAr2[i]);
			}

			System.out.println("Test");

//			if (strAr2[i].compareTo(strAr2[i])) {
//				System.out.println("" + strAr2[i]);
//			}
		}
	}

}
