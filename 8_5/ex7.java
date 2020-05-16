//program to take next() input and  verify if it is 
//suitable for datatype.
import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		System.out.println("main starts.");
    
    

		Scanner s1 = new Scanner(System.in);

		if (s1.hasNextBoolean()) {
			
		Boolean b1 = nextBoolean();
		System.out.println("value os fboo" +b1);
		}
		else {
			System.out.println("enter proper Float value");
		}
		System.out.println("main ends.");
	}
}