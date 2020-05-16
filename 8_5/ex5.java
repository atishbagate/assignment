//program to take Long input and  verify if it is 
//suitable for datatype.
import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		System.out.println("main starts..");
	Scanner s1 = new Scanner(System.in);

	if (s1.hasNextLong()) {
		Long d = s1.nextLong();
		System.out.println("long value is = "+d);
	}
	else {
		System.out.println("enter proper value of Double.");
	}


		System.out.println("main ends");
	}

}