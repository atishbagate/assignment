   		
/*C. Design a function to count the number of vowels in the given array.

Note:- All array should be sent from calling functions,
Andl results should sent back to calling functions.*/

class A
{	
	public static void main(String[] args) 
	{
	System.out.println("main start..");
	
	char arrex3[] = {'l','g','e','r','i','o','z','u'};

	count(arrex3); // sending array to count method

	// retriving  number fron count method.

	int arr = count(number); 
	System.out.println(arr);


	System.out.println("main ends..");
	}

	public static int count(char[] arrex3)
	{
		System.out.println("cunt starts..");
		int count1 = 0;

		for (int i = 0;i<arrex3.length;i++ ) 
		{
			char ch = arrex3[i];
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			{
			count1++;	
			}
			
		}
		System.out.println(count1);
		int number = count1;
		System.out.println(number);

		System.out.println("count ends..");

		return number;
	}

	public static int print(int number)
	{
		int number1 = number;
		System.out.println(number1);

		return number1;
	}
}