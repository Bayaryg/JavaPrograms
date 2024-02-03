package javaprograms;

public class FindMissingNum {

	public static void main(String[] args) {
		// find missing number in an array
		
		int[] arr1= {3,4,6,7,8,10};
		
		for(int i=0;i<arr1.length-1;i++)
		{
			
				if((arr1[i]+1)!=(arr1[i+1]))
				{
					System.out.println(arr1[i]+1);
				}
		}

	}

}
