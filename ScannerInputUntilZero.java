package javaprograms;

import java.util.Scanner;

public class ScannerInputUntilZero {

	public static void main(String[] args) {
		// Keep Adding the numbers from human input until the user enters 0 
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i>=0;i++)
		{
			System.out.println("enter value of x");
			int x=sc.nextInt();
			
			if(x==0)
			{
				System.out.println("loops stops as entered value is 0");
				break;
			}
			else
			{
				i++;
			}
		}


	}

}
