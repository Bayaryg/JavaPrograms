package javaprograms;
public class PrimeCheck {	
	static boolean  isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		else
		{			
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
						
		}		
		return true;		
		}		
	}
	public static void main(String[] args) {
	//check prime or not(devided by 1 and itself)	
		System.out.println(isPrime(17));
	}

}
