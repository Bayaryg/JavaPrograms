package javaprograms;

public class MaxOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10, b=30,c=20;
		
		if(a>b&&a>c)
		{
			System.out.println("The largest number is :" +a);
		
		}
		else if(b>a &&b>c)
		{
			System.out.println("The largest number is :" +b);
		
		}
		else
		{
			System.out.println("The largest number is :" +c);
		}
		
		//approach 2
		int largest1=a>b?a:b;
		int largest2=c>largest1?c:largest1;
		System.out.println("the largest number is: " +largest2);
	}

}
