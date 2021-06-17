package fuctionalProgram;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns: ");
		int rows = scan.nextInt();
		int columns = scan.nextInt();
		int[][] array = new int[rows][columns];

		System.out.println("Insert values in the [" + rows + "," + columns + "] array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = scan.nextInt();
			}
			System.out.println(" ");
		}
		scan.close();
		displayOutput(array, rows, columns);
	}

	private static void displayOutput(int[][] array, int rows, int columns) {
		System.out.println("Displaying the output: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
