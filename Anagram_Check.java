package javaprograms;
import java.util.Arrays;
public class Anagram_Check {
	
	static boolean anagram(String s1, String s2)
	{
		
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));		
		if (s1.length()!=s2.length())
		{
			return false;
		}		
		for(int i=0;i<s1.length();i++)
		{
			if(arr1[i]!=arr2[i])
                  {
	                  return false;
                  }
		}
		return true;
	}
	public static void main(String[] args) {
		// gram and arm not anagram & arm and ram are anagram
		
		System.out.println("two strings are anagram?: "+anagram("listen", "silent"));
		

	}

}
