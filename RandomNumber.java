package javaprograms;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) 
	{
	//Randomclass
		
		Random r1=new Random();
		int num1=r1.nextInt(100);
		
		System.out.println(num1);
		
		double num2=r1.nextDouble(num1);
		
		System.out.println(num2);

	}

}
