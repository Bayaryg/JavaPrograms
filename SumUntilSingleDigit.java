package javaprograms;

public class SumUntilSingleDigit {
	
	static void sum(int num)//4534
	{		
		int sum=0;	
		
		while(num>0||sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			
			sum=sum+num%10;
			num=num/10;
			
	}		
		System.out.println(sum);
		
		}		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1235);
		}

}
