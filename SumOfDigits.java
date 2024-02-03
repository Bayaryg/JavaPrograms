package javaprograms;

public class SumOfDigits {
	
	static int sum(int num)
	{
		int sum=0;
		
		while(num!=0)
		{
			int rem=num%10;
			
			sum=sum+rem;
			
			num=num/10;
		}
		
		return sum;
	}	
		

	public static void main(String[] args) {
		// Write a Java Program to print the sum of digits of a given integer.

		System.out.println(sum(345));
	}

}
