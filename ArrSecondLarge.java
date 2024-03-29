package Array;

public class ArrSecondLarge {
	public static void main(String[] args) {
		int temp = 0;
		int arr[]= {1,3,5,7,214,12,13,219,211,13};
			for(int i=0; i<= arr.length-1;i++) {
				for(int j =i+1;j<=arr.length-1;j++) {
					if(arr[i]>arr[j]) {
						 temp = arr[i];  
		                    arr[i] = arr[j];  
		                    arr[j] = temp; 
					}
					
				}
				
			}
			System.out.println(arr[arr.length-2]);
	}
	
}
