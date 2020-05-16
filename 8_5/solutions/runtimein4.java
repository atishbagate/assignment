import java.util.Scanner;
class A{
	public static void main(String[] args) {
		System.out.println("main starts------");
		Scanner s1= new Scanner(System.in);
		System.out.println("Please provide integer i/p value b/w -2^63 to 2^63-1");
		boolean b1=s1.hasNextLong();		
		if(b1){
			print(s1.nextLong());
		}	
		else{
			System.out.println("Enter valid input");
		}
		System.out.println("main ends------");	
	}
	public static void print(Long a){
		System.out.println("print starts------");
		System.out.println("Given input is:"+a);
		System.out.println("print ends------");
	}
}
/*output:
main starts------
Please provide integer i/p value b/w -2^63 to 2^63-1
-865329
print starts------
Given input is:-865329
print ends------
main ends------
*/