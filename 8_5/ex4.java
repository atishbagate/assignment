//program to take Double input and  verify if it is 
//suitable for datatype.
import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		System.out.println("main starts..");
	
		Scanner s1 = new Scanner(System.in);

		System.out.println("enter the double value");

		if (s1.hasNextDouble()) {
			Double d = s1.nextDouble();
			System.out.println("double value is : "+d);
		}
		else{
			System.out.println("enter a proper Double value.");
		}




		System.out.println("main ends");
	}

}