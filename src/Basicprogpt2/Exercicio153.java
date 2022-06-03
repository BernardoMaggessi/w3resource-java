package Basicprogpt2;

import java.util.Scanner;

public class Exercicio153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("input first number:");
		int num1 = sc.nextInt();
		System.out.print("input second number:");
		int num2 = sc.nextInt();
		
		System.out.println(num1 > 0 && num1 < 1 && num2 > 0 && num2 < 1);
		
		sc.close();
	}

}
