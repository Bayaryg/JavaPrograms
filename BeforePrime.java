package javaprograms;

import java.util.Scanner;
public class BeforePrime {

	public static void main(String[] args) {
		//if n=5 then 456 will be the output
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
        boolean b=true;
        
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				b=false;				
			}
		}
		if(b==false)
		{
			System.out.println("The given number "+ n +" is not a prime number");
		}
		else
		{
		System.out.println("Before and after of given prime number are: " +(n-1)+","+n+","+(n+1));
		}
	}
}
