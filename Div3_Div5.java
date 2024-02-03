package javaprograms;

public class Div3_Div5 {

	public static void main(String[] args) {
		// print 1 to 100 3 computer, 5mouse, computer and mouse
		for(int i=1;i<=100;i++)
		{
		if(i%3==0)
		{
			if(i%5==0)
			{
				System.out.println(i+" ComputerMouse");
			}
			else
			System.out.println(i+" computer");
			
		}
		else if(i%5==0)
		{
			if(i%3==0)
			{
				System.out.println(i+" ComputerMouse");
			}
			
			System.out.println(i+" mouse");
		}
		else
		{
			System.out.println(i+" not divisible by 3 and 5");
		}
		}

	}

}
