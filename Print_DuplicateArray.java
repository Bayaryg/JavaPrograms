package javaprograms;

import java.util.Arrays;

public class Print_DuplicateArray {

	public static void main(String[] args) {
		
		int arr1[]= {7,3,2,4,1,99,7,3,1};
		//String lang[]={"java","c","c++","java","java"};
		
		boolean flag=false;
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					System.out.print(arr1[i]+" ");
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("no duplicates");
		}
		
//		int a1[]=new int[4];
//		a1[1]=5;
//		a1[2]=6;
//		a1[3]=7;
//		
//      System.out.println(a1[0]);
	}

}
