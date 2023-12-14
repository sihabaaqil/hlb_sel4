package demo.Test.IC;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rever("as");

//		String str = "Geeks", nstr = "";
//		char ch;
//
//		System.out.print("Original word: ");
//		System.out.println("Geeks"); // Example word
//
//		for (int i = 0; i < str.length(); i++) {
//			ch = str.charAt(i); // extracts each character
//			nstr = ch + nstr; // adds each character in front of the existing string
//		}
//		System.out.println("Reversed word: " + nstr);

	}

	public static StringBuilder rever(String in) {
		String input = "Geeks for Geeks";

		StringBuilder input1 = new StringBuilder();

		// append a string into StringBuilder input1
		input1.append(in);

		// reverse StringBuilder input1
		input1.reverse();

		// print reversed String
		System.out.println(input1);
		return input1;
	}

}
