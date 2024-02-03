package javaprograms;

public class CapitalCount {
	
	public static void countcap(String s)
	{
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				count++;
			}
		}
		
		System.out.println("number of capital letters in given string is: "+count);
		
	}

	public static void main(String[] args) {
		
		countcap("Archana Bayary G");
	}

}
