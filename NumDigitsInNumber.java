package javaprograms;

public class NumDigitsInNumber {

	
	static void countnum(int num) 
	{
		int count=0;
		while(num>0)
		{
			count++;			
			num=num/10;
			
		}
		System.out.println("number of digits in given number: " +count);
	}
	
	public static void main(String[] args)
	{
		
        countnum(3452123);
	}

}
