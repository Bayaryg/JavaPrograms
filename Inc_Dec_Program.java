package javaprograms;

public class Inc_Dec_Program {

	public static void main(String[] args) {
		// i++, ++i, i--, --i
		
		int i=10, j=30, k=0;
		
//		System.out.println(i++ + ++j + k++);
//		                 //10+    31+  0=41
//		System.out.println(i);//11
//		System.out.println(j);//31
//		System.out.println(k);//1
		
//		System.out.println(i++ *8);//80
//		System.out.println(i);//11
		
		System.out.println(i-- + --j - ++k);
		//                 10+29-1
		System.out.println(i);//9
		System.out.println(j);//29
		System.out.println(k);//1

	}

}
