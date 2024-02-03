package javaprograms;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="%&^#Archana%&^@";
	//print special characters	
	String s1=s.replaceAll("[A-Za-z0-9]", "");
	System.out.println(s1);
	
	//remove special characters
	
	String s2=s.replaceAll("[^A-Za-z0-9]", "");
	System.out.println(s2);
	}

}
