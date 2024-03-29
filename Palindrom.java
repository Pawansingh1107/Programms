package Array;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name");
		String s = sc.nextLine();
		char [] arr= s.toCharArray();
		boolean check = false;
		
		for(int i =0; i<= arr.length-1;i++) {
			for(int j=arr.length-1;j>=0;j--) {
				if(arr[i]==arr[j]) {
					check = true;
				}
				else {
					check = false;
					}
				
			}
		}
		if(check == true)
		{
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
		
		
		
	}
}
