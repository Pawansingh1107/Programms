package Array;

public class Primenumber {
	public static void main(String[] args) {
		int i ;
		int j ;
		int check;
		
		for( i=2; i<=30; i++)
		{
			check = 0;
			for(j=2; j<i;j++)
			{
				if(i%j==0)
				{
					check++;
					break;
				}
			}
			if(check==0)
				System.out.println(i);
		}
		
		
		
	}
}
