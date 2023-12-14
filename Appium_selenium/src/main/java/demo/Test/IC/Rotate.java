package demo.Test.IC;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String str1 = "AASD";
		String str1 = "ABCD"; // "GeeksforGeeks";//
		int rep = 2;

		// System.out.println(leftrotate2(str1, rep) + leftrotate(str1, rep));
		System.out.println(rightrotate3(str1, rep));
		// System.out.println(leftrotate(str1, 1));

		// System.out.println(rightrotate(str1, rep) + rightrotate2(str1, rep));
		// System.out.println(rightrotate(str1, 1));
	}

	static String leftrotate2(String str, int d) {
		String ans = str.substring(d);// + str.substring(0, d);
		return ans;
	}

	static String leftrotate(String str, int d) {
		String ans = str.substring(0, d);
		return ans;
	}

	static String rightrotate2(String str, int d) {
		String ans = str.substring(0, str.length() - d);// + str.substring(0, d);
		return ans;
	}

	static String rightrotate(String str, int d) {
		String ans = str.substring(str.length() - d);
		return ans;
	}

	// function that rotates s towards right by d
	static String rightrotate3(String str, int d) {
		return leftrotate(str, str.length() - d);
	}
}
