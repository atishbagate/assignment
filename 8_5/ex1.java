//program to take integer input and  verify if it is 
//suitable for datatype.
import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		System.out.println("main starts");

		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the int input: ");
		
		if (s1.hasNextInt()) {
			
		int num = s1.nextInt();

		System.out.println("input integer is : "+num);
		}
		else {
			System.out.println("provide proper integer value.");
		}
		


		System.out.println("main ends");
	}
}