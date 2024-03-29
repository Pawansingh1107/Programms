package Array;

public class Fibnocciseries {
	public static void main(String[] args) {
		int i=0;
		int j=1;
		int ser;
		ser = i+j;
		while(ser<=100) {
			System.out.println(ser);
			i = j;
			j = ser;
			ser = i+j; 
			
			
		}
		
		
	}
}
