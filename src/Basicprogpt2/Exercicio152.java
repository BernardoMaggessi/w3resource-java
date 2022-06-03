package Basicprogpt2;

import java.util.Scanner;

public class Exercicio152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("input first number: ");
		int num1 = sc.nextInt();
		System.out.print("input second number: ");
		int num2 = sc.nextInt();
		System.out.print("input third number: ");
		int num3 = sc.nextInt();
		System.out.print("input fourth number: ");
		int num4 = sc.nextInt();

		if (num1 == num2 && num3 == num4)
			System.out.println("numbers are equal.");
		else
			System.out.println("numbers are not equal");

		sc.close();

	}

}
