import java.util.Scanner;
class A{
	public static void main(String[] args) {
		System.out.println("main starts----");
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please provide an input string");
        String s = s1.nextLine();
        print(s);
        System.out.println("main ends----");
	}
	public static void print(String s){
		System.out.println("print starts------");
		System.out.println("Given input is:"+s);
		System.out.println("print ends------");
	}
}
/*output:
main starts----
Please provide an input string
what's up?
print starts------
Given input is:what's up?
print ends------
main ends----
*/