package fuctionalProgram;

import java.util.Scanner;

public class SumOfThreeInteger {
	static Scanner scan = new Scanner(System.in);
	int num;

	void InputArray() {
		int array[] = new int[num];
		System.out.println("Enter the values in array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < num - 2; i++) {
			for (int j = i + 1; j < num - 1; j++) {
				for (int k = j + 1; k < num; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.print("Triplet found: [" + array[i] + " " + array[j] + " " + array[k] + "]");
						System.out.print("\n");
					}

				}
			}
		}
	}

	public static void main(String[] args) {
		SumOfThreeInteger obj = new SumOfThreeInteger();
		System.out.println("Enter length of your array: ");
		obj.num = scan.nextInt();
		obj.InputArray();

	}
}