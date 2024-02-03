package javaprograms;

public class Number_Palindrome {
	
	static void number(int num)
	{
		int rev=0;
		int temp=num; 
		int rem;//454
	
		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println(rev);
		
		if(rev==temp)
		{
			System.out.println("The given number is paliindrome");
		
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

	public static void main(String[] args) {
		
		number(4554);
		number(1234);	}

}
