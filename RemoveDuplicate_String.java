package javaprograms;

public class RemoveDuplicate_String {
	
	public static void removeDuplicates(String str)   
    {   
        //Create an empty string   
        String newstr = new String();         
        
        int length = str.length();            
       
        for (int i = 0; i < length; i++)    
        {                
            char a1 = str.charAt(i); //a1=q              
           
            if (newstr.indexOf(a1) < 0)   //if alphabet is not present the index is less than 0? and if index char is present then it is not less than 0
            {   
                newstr=newstr+a1; //aw 
            }   
        }   
        //Print string after removing duplicate characters  
        
        System.out.println(newstr);
    }   
	public static void main(String[] args) {		 
           
        removeDuplicates("12222111345");   
		

	}

}
