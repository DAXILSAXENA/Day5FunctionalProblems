package fuctionalProgram;

import java.util.Scanner;

public class Quadratic {
	int a, b, c;

	public void rootCalculation() {
		int delta = (b * b) - (4 * a * c);
		if (delta < 0) {
			System.out.println("Roots of equation are not possible ");
		} else {
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("The root1 value of the equation is: " + root1);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("The root2 value of the equation is: " + root2);

		}
	}

	public static void main(String[] args) {

		Quadratic obj = new Quadratic();
		System.out.println("Enter the value of a, b and c: ");
		Scanner scan = new Scanner(System.in);
		obj.a = scan.nextInt();
		obj.b = scan.nextInt();
		obj.c = scan.nextInt();
		System.out.println("The equation is: " + obj.a + "x^2 + " + obj.b + "x + " + obj.c);
		obj.rootCalculation();
		scan.close();
	}
}
