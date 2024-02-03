package javaprograms;

public class MaxConsecutive_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {3,4,5,6,1,8,2,4,5,6,7,8,9,10};
		int count=0;
		//int max=0;
		
		for(int i=0;i<arr1.length-1;i++)
		{
			if(arr1[i]+1==arr1[i+1])
			{
				count++;
			}
			else
			{
				count=0;
			}
			
		//	max = Math.max(max, count+1);
			
		}
		System.out.println(count+1); //3 times compares so output should be 3+1
	}

}
