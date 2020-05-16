/*4] Design a function which will take two
 STrings as an input and return true if they are same else returns false.
*/

 class A
 {
public static void main(String[] args) 
{
	System.out.println("main starts..");
 String s1 = "hello";

 String s2 = "Hello";

 boolean b1 = add(s1,s2);
 System.out.println(b1);
 	System.out.println("main ends..");	
}
	
public static boolean add(String s1, String s2)
{ 
	System.out.println("boolean starts..");
	System.out.println(s1);
	System.out.println(s2);

	boolean b1 = s1.equals(s2);

	System.out.println("boolean ends..");
return b1;
}

}
