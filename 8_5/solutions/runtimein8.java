import java.util.Scanner;
class A{
	public static void main(String[] args) {
		System.out.println("main starts----");
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please provide an input character");
        String s = s1.next();
        print(s);
        System.out.println("main ends----");
	}
	public static void print(String s){
		System.out.println("print starts------");
		char c = s.charAt(0);
		System.out.println("Given input is:"+c);
		System.out.println("print ends------");
	}
}
/*output:
main starts----
Please provide an input character
h
print starts------
Given input is:h
print ends------
main ends----
*/