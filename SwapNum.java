package javaprograms;
public class SwapNum {

	public static void main(String[] args) {
				
		int num1=40;
		int num2=50;
		
		num1=num1+num2;//sum
		//90
		num2=num1-num2;//sum-num2
		//40=90-50
		num1=num1-num2;
		//50=90-40
		System.out.println(num1);
		System.out.println(num2);
		
		int a,b, temp;
		
		a=45;
		b=65;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);

	}

}
