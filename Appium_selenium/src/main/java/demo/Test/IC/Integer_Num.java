package demo.Test.IC;

public class Integer_Num {

	public static void main(String[] args) {
		long a = 12345678912345L;
		System.out.println(a);
		
		int length = String.valueOf(a).length();
		System.out.println(length);
		
		int length2 = (int) (Math.log10(a) + 1);
		System.out.println(length2);
	}

}
