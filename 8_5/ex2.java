//program to take string input and  verify if it is 
//suitable for datatype.
import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		System.out.println("main starts");

		Scanner s1 = new Scanner(System.in);
		System.out.println("enter a Character value : ");


		if (s1.hasNext()) {
			String ch = s1.next();
			System.out.println("input Character is : "+ch);
		}
		else {
			System.out.println("provide Character input.");
		}
		


		System.out.println("main ends");
	}
}