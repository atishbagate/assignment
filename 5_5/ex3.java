/*3] Design a function which will 
count the number of vowels in  the given string.*/

class A
{
	public static void main(String[] args) 
	{ System.out.println("main starts..");
		String s1 = "i am the best our coding is the best";

	int number = count(s1);
	System.out.println(number);
	
	System.out.println("main ends..");
	}

	public static int count(String s1)
	{

	 System.out.println("count starts..");
		char[] arrs2 = s1.toCharArray();

		int count1 = 0;

		for (int i = 0;i<arrs2.length;i++ ) 
		{
			char ch = arrs2[i];
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			{
			count1++;	
			}
			
		}
		
		int number = count1;
		
	System.out.println("count ends..");
		return number;
	}
}