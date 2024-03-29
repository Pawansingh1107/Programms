package Array;

import java.util.Scanner;

public class Practicekg {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		
		multiplicationTable(num);
		
	}	
	
	public static void multiplicationTable(int num) {
		int i = 1;
		while(i<=10) {
			System.out.println(num*i);
			i++;
		}
	}
	
	
	
	
}

