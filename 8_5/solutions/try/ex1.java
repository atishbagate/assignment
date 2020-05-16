import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		
		System.out.println("main starts..");

		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the integer value : ");
		boolean b1 = s1.hasNextByte();
			if (b1) 
			{
				
				print(s1.nextByte());
			}
			else {
				System.out.println("enter valid input.");
			}

		System.out.println("main ends..");
	}
	public static void print(byte a)
	{
		System.out.println("print starts");

		System.out.println("given input : "+a);

		System.out.println("print ends..");
	}
}