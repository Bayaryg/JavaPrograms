package javaprograms;

public class LinearSearchArray {

	public static void main(String[] args) {
		
		
		int[] arr1= {10,20,30,40,50};
		
	int	checknum=35;
	boolean flag=false;
	
	for(int i=0;i<arr1.length;i++)
	{
       if(checknum==arr1[i])
       {
    	   System.out.println("the number is present at: " +i);
    	   flag=true;
    	   break;
       }
       
       
	}
	
	if(flag==false)
	{
	System.out.println("The given number "+checknum+" not present");
	}

}
}