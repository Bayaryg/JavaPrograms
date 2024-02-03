package javaprograms;

public class EvenOddArray {
	
	static void evenOdd(int[] num)
	{
		
		System.out.println("even numbers");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				System.out.println(num[i]);
			}

		}
		
		System.out.println("odd numbers");
		for(int i=0;i<num.length;i++)

		{
			if(num[i]%2!=0)
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		
		int num[]= {1,2,3,4,5};
		evenOdd(num);

	}

}
