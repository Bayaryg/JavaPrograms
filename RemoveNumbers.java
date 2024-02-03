package javaprograms;


public class RemoveNumbers {
	
	static void removenum(String name)
	{
		String s="";
		
		for(int i=0;i<name.length();i++)
		{
			char check=name.charAt(i);
			if((check>='A'&&check<='Z') ||(check>='a'&&check<='z'))
			{
				s=s+check;
			}
		}
		
		System.out.println("the new String is: " +s);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removenum("abg123AED21A");
	}

}
