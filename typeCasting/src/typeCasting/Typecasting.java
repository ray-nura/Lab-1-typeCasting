package typeCasting;

public class Typecasting {

	public static void main(String[] args) {
		// implicit conversion
		System.out.println("Implicit Type Casting--small to large");
		char a='D';
		System.out.println("Value of a (char): "+a);
		int b=a;
		System.out.println("Value of b (int): "+b);		
		float c=a;
		System.out.println("Value of c (float): "+c);		
		long d=a;
		System.out.println("Value of d (long): "+d);		
		double e=a;
		System.out.println("Value of e (double): "+e);		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting -- Large to small");
		//explicit conversion
		
		double x=e;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		char z=(char)y;
		System.out.println("Value of char :"+z);
	}

}
