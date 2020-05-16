import java.util.Scanner;
class A{
	public static void main(String[] args) {
		System.out.println("main starts------");
		Scanner s1= new Scanner(System.in);
		System.out.println("Please provide i/p as true or false");
		boolean b1=s1.hasNextBoolean();		
		if(b1){
			print(s1.nextBoolean());
		}	
		else{
			System.out.println("Enter valid input");
		}
		System.out.println("main ends------");	
	}
	public static void print(Boolean a){
		System.out.println("print starts------");
		System.out.println("Given input is:"+a);
		System.out.println("print ends------");
	}
}
/*output:
main starts------
Please provide i/p as true or false
true
print starts------
Given input is:true
print ends------
main ends------
*/