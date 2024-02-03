package javaprograms;

public class MultiplicationTable {
	
	static void multiply(int num)
	{
		int result;
		for(int i=1;i<=10;i++)
		{
			result=num*i;
			System.out.println(num+"*"+i+"="+result);
		}		
	
	}

	public static void main(String[] args) {
		// get the multiplication table for any given number
		multiply(3);

	}

}
