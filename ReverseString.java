package Array;

import java.util.Scanner;

public class ReverseString {

		public static void main (String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter yur name");
			String Str = scanner.nextLine();
			char[] arr = Str.toCharArray();
	for(int i = Str.length() - 1; i >= 0; i--)
	{
	System.out.print(arr[i]);
	}
 }
}
		

	
	
	
	
	
	
	
	

