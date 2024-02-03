package javaprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Fibonacci series(0,1,1,2,3,5,8....)count of preceeding numbers
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenth og fibonacci numbersa you want:");
		int fiblen=sc.nextInt();
		
		int arr1[]=new int[fiblen];
		arr1[0]=0;
		arr1[1]=1;
		
		for (int i=2;i<fiblen;i++)
		{
			arr1[i]=arr1[i-1]+arr1[i-2];
		}
		
		for(int i=0;i<fiblen;i++)
		{
			System.out.println(arr1[i]);
		}
		
		sc.close();

	}

}
