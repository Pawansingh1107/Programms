package Array;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number for factorial");
		int num = sc.nextInt();
		int fact = factorial(num);
		System.out.println(fact);
	}
	public static int factorial(int num) {
		int i=2;
		int fact =1;
		while(i <=num) {
			fact *=i;
			i++;
		}
		return fact;
		
	}
	
}
