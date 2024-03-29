package Array;

import java.util.Scanner;

public class Armstrongnumber {
	
	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = sc.nextInt();
			{
//				number of digits
				int t1 = num; 
				int digit = 0;  
				while(t1>0)
				{
					digit++;
					t1 = t1/10;
				}
//				sum & multiplication
				int t2 = num;  //1
				int sum = 0; //153
				while(t2>0)
				{
					int rem = t2%10; //1
					int multi = 1; //1
					for(int i=1;i<=digit;i++)
					{
						multi = rem*multi;
					}
					sum+=multi;
					t2/=10;
				}
//				comparison
				if(num==sum)
				{
					System.out.println(num + " is an armstrong number");
				}
				else
				{
					System.out.println(num + " is not an armstrong number");
				}
			}
		}
	}
}

