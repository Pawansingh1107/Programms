package Array;

import java.util.Scanner;

public class Sumoddnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the number for sum of odd number");
		int num = sc.nextInt();
		int sum =sumOdd(num);
		System.out.println(sum);
	}
	
	public static int sumOdd(int num)
	{
		int a=1;
		int s=0;
		while(a<=num) {
			
			s +=a;
			
			a+=2;
		}
		return s;
	}
}
