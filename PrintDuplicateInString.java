package javaprograms;

import java.util.Arrays;

public class PrintDuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input="aabbcddc";//output=bdf
		
		char arr1[]=input.toCharArray();
		
		System.out.println(Arrays.toString(arr1));
		
		for(int i=0;i<arr1.length;i++)
		{
			for (int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					System.out.print(arr1[j]);
				}
			}
			
		}
	}

}
