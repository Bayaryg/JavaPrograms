package javaprograms;

public class EvenOdd {
	
	static void number(int num)
	{
		
		if(num%2==0)
		{
			System.out.println("The given number "+num+" is even");
		}
		else
		{
			System.out.println("The given number "+num+" is odd");
		}
		
	}

	public static void main(String[] args) {
		// check if the given number is even or odd

		number(10);
		number(21);
	}

}
