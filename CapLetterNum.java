package javaprograms;

public class CapLetterNum {

	public static void main(String[] args) {
		String s1="Archana Bayary GGGGG";
		int count = 0;
		
		for(int i=0;i<s1.length();i++)
        if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z')
        	count++;
        
		System.out.println("The number of capital letters in given string is: "+count);
	}

}
