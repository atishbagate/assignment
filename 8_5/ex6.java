//program to take short input and  verify if it is 
//suitable for datatype.
import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		System.out.println("main starts.");

		Scanner s1 = new Scanner(System.in);

		if (s1.hasNextShort()) {
			Short s = s1.nextShort();
			System.out.println("short value is : "+s);
		}
		else {
			System.out.println("enter proper short value.");
		}


		System.out.println("main ends");
	}
}