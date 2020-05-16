/*a] Design 
a function which will return 
a character value specified at the given input index.*/

class A
{
	public static void main(String[] args) 
	{
	
	System.out.println("main starts");

 	String s1 = " data"; // string initialize
 	char v1 = input(s1); // sending input to function and returning back the value;
 	System.out.println(v1); 

 	
	System.out.println("main ends");
	return;	

	}

	public static char input( String s1) //input  function and with string input value.
	{
		System.out.println("input starts..");

		System.out.println(s1);
		int index = 2;  //input index value.

		char[] c = s1.toCharArray(); // converting string in to array.

		for (int i=0;i<c.length ;i+=1 )  // printing a array .
		{
		System.out.println(c[i]);	
		}
		System.out.println();

		char v1 = c[index];  //taking index  to find value.
 		

 		System.out.println("input ends..");
		return v1;  //return v1 char value.
	}
}