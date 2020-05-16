import java.util.Scanner;
class A{
	public static void main(String[] args) {
		System.out.println("main starts------");
		Scanner s1= new Scanner(System.in);
		System.out.println("Please provide decimal i/p value b/w -2^31 to 2^31-1");
		boolean b1=s1.hasNextFloat();		
		if(b1){
			print(s1.nextFloat());
		}	
		else{
			System.out.println("Enter valid input");
		}
		System.out.println("main ends------");	
	}
	public static void print(Float a){
		System.out.println("print starts------");
		System.out.println("Given input is:"+a);
		System.out.println("print ends------");
	}
}
/*output:
main starts------
Please provide decimal i/p value b/w -2^31 to 2^31-1
0.2356
print starts------
Given input is:0.2356
print ends------
main ends------
*/