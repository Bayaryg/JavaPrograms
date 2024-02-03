package javaprograms;

public class Factorial {
	
	static int fact(int num)
	{
//		if(num==0)
//		{
//			return 1;
//		}
//		return num*fact(num-1);
		
		int a=1;
		
		for(int i=2;i<=num;i++)
		{
			a=a*i;
		}
		return a;
	}

	public static void main(String[] args) {
		// 6 factorial=6*5*4*3*2*1
		int n=5;
		System.out.println("Factorial of "+n+" is :"+ fact(5));

	}

}
