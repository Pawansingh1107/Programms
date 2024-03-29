package Array;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number a");
		int a = sc.nextInt();
		System.out.println("Please enter number b");
		int b = sc.nextInt();
		int gcd = gcd(a,b);
		System.out.println("GCD is " + gcd);
		
	}
	
	public static int gcd(int a , int b) {
		int gcd =1;
		int i=2;
		int least = least(a, b);
		while(i<=least) {
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
			i++;
			
		}
		return gcd;
		
		
	}
	
	public static int least(int a, int b) {
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
		
	}
	
}
