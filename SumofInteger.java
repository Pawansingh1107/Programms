package Array;

import java.util.Scanner;

public class SumofInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		int sum =0;
		while(num>0)
		{
			int digit = num%10;
			num/=10;
			sum+= digit;
			
		}
		System.out.println(sum);
	}
}
