package javaprograms;

import java.util.Arrays;

public class SecondMax_Min {
	
	static void secMaxMin(int[] arr1 )
	{
		int temp;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		
		
		System.out.println("The second maximum number is: "+ arr1[arr1.length-2]);
		System.out.println("The second minimum number is: "+ arr1[1]);
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {2,5,1,77,34,4,3,99};
		secMaxMin(arr1);
		
	}

}
