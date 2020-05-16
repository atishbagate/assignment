import java.util.Scanner;
class A{
	public static void main(String[] args) {
		System.out.println("main starts------");
		Scanner s1= new Scanner(System.in);
		System.out.println("Please provide integer i/p value b/w -127 to 128");
		boolean b1=s1.hasNextByte();		
		if(b1){
			print(s1.nextByte());
		}	
		else{
			System.out.println("Enter valid input");
		}
		System.out.println("main ends------");	
	}
	public static void print(byte a){
		System.out.println("print starts------");
		System.out.println("Given input is:"+a);
		System.out.println("print ends------");
	}
}
/*output:
main starts------
Please provide integer i/p value b/w -127 to 128
34
print starts------
Given input is:34
print ends------
main ends------
*/