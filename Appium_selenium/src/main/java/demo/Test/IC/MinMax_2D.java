package demo.Test.IC;

public class MinMax_2D {

	public static void main(String[] args) {

		// matrix
		int mat[][] = { { 1, 2, 3, 4 }, { 25, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		System.out.println(findMax(mat));

//		int[][] data = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 }, { 0, 2, 6, 3, -1, -8 } };
//		System.out.println(getMaxValue(data));
//		System.out.println(getMinValue(data));
	}

	public static int getMaxValue(int[][] numbers) {
		int maxValue = numbers[0][0];
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers[j].length; i++) {
				if (numbers[j][i] > maxValue) {
					maxValue = numbers[j][i];
				}
			}
		}
		return maxValue;
	}

	public static int getMinValue(int[][] numbers) {
		int minValue = numbers[0][0];
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers[j].length; i++) {
				if (numbers[j][i] < minValue) {
					minValue = numbers[j][i];
				}
			}
		}
		return minValue;

	}

	final static int N = 4;
	final static int M = 4;

	// Function to find max element
	// mat[][] : 2D array to find max element
	static int findMax(int mat[][]) {

		// Initializing max element as INT_MIN
		int maxElement = Integer.MIN_VALUE;

		// checking each element of matrix
		// if it is greater than maxElement,
		// update maxElement
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (mat[i][j] > maxElement) {
					maxElement = mat[i][j];
				}
			}
		}

		// finally return maxElement
		return maxElement;
	}

}
