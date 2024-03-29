package Array;

public class Vowelcounter {
	public static void main(String[] args) {
		String s = "YashwAnt";
		char [] arr= s.toCharArray();
		int vowel=0;
		for(int j = 0; j<=arr.length-1;j++) {
			if((arr[j]== 65) || (arr[j]== 97)|| (arr[j]==69)|| (arr[j]== 101)  || (arr[j]==73) || (arr[j]==105) || (arr[j]==79) || (arr[j]==111) || (arr[j]==85)|| (arr[j]==117)) {
				vowel++;
			}
			
			
		}
		System.out.println(vowel);
		
	}
}
