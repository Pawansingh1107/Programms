package Array;

import java.util.Scanner;

public class PrimeNumberr {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the number");
	int num = sc.nextInt();
	
	
	boolean isPrime = isPrime(num);
	if(isPrime) {
		System.out.println("Prime number");
	}
	else {
		System.out.println("Not a prime number");
	}
}
	public static boolean isPrime(int num) {
			
		int i =2;
		while(i<num) {
			if(num%i==0) {
				return false;
			}
			i++;
		}
		
		return true;
	}

}
