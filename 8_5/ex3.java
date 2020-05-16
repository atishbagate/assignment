//program to take float input and  verify if it is 
//suitable for datatype.
import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		System.out.println("main starts.");

		Scanner s1 = new Scanner(System.in);

		System.out.println("enter float value : ");

		if (s1.hasNextFloat()) {
			Float f = s1.nextFloat();
			System.out.println("float value is: "+f);
			
		}
		else {
			System.out.println("enter proper Float value");
		}

		System.out.println("main ends.");
	}
}