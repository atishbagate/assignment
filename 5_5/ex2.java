/*2] Design a function 
which will return a String which is reverse of the input string.
*/

class A
{
	public static void main(String[] args) {
		System.out.println("main starts..");

	String s1 = "Donald";  //
	
	char[] c = input(s1);

	System.out.println("string after reverse");
	 for (int i = 0;i<c.length;i+=1 ) 
				{
		        System.out.print(c[i]);
				}
	System.out.println();

		System.out.println("main ends..");
		return;
	}

	public static char[] input(String s1)
	{
		System.out.println("input starts..");
	
		char[] c = s1.toCharArray();
			for (int i = 0;i<c.length;i+=1 ) 
						{
				        System.out.print(c[i]);
						}
		System.out.println();
		int l,r = 0;
		r = c.length-1;

		for (l=0;l<r ;l++,r-- ) 
		{
		char temp = c[l];
		c[l] = c[r];
		c[r] = temp;	
		}
		
          
			System.out.println("input ends..");
		return c;


	}
}