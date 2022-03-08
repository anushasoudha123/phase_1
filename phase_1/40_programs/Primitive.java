import java.util.Scanner;

public class Primitive
{
	// Converting string to int (or Integer)
	public static int toInteger(String s) {
	    return Integer.parseInt(s);
	}
	 
	//Converting string to double (or Double)
	public static double toDouble(String s) {
	    return Double.parseDouble(s);
	}
	// Converting string to long (or Long)
	public static long toLong(String s) {
	    return Long.parseLong(s);
	}
	// Converting string to boolean (or Boolean)
	public static boolean toBoolean(String s) {
	    return Boolean.parseBoolean(s);
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string to convert to Integer");
		System.out.println(toInteger(scanner.next()));
		
		System.out.println("Enter string to convert to Double");
		System.out.println(toDouble(scanner.next()));
		
		System.out.println("Enter string to convert to Long");
		System.out.println(toLong(scanner.next()));
		
		System.out.println("Enter string to convert to Boolean");
		System.out.println(toBoolean(scanner.next()));
		
	}

}