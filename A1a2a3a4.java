package javaprograms;

import java.util.Scanner;

public class A1a2a3a4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter range");
		int n=sc.nextInt();
		int power=1;
		
		for (int i=1;i<=n;i++)
		{
			//int power=(int) Math.pow(a, i);
			//System.out.print(power+" ");
			 power=power*a;
			 System.out.print(power+" ");
		}
		

	}

}
