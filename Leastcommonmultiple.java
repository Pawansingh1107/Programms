package Array;

import java.util.Scanner;

public class Leastcommonmultiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int a =sc.nextInt();
		System.out.println("Please enter Second number");
		int b =sc.nextInt();
		int lcm = lcm(a,b);
		System.out.println("LCM of number is " + lcm);
		}
	
	public static int lcm(int a, int b) {
		int i=1;
		while(i<=b) {
			int multi =a*i;
			if(multi%b==0)
			{
				return multi;
			}
			i++;
		}
		
		return 0;
	}
}
