package Array;

import java.util.ArrayList;

public class Arrayq2 {

	public static void main(String[] args) {
//		Q2)Write a Java program to find the maximum element in an ArrayList of integers.
		
			ArrayList<Integer> num= new ArrayList<Integer>();
			num.add(2);
			num.add(9);
			num.add(15);
			num.add(3);
			num.add(7);
			
			int maxnum = num(0);
			for(int i =(0);i<=num.size();i++)
			{
				for(int j=(1);j<=num.size();j++)
				{
					if (i< j) {
						 maxnum =j();
					}
						
				}
			}
		
		System.out.println(maxnum);
		
		
		
		
	}
	
	
	
	
}
