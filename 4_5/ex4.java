/*D. Design a function to count
 the number of times the given number occurs in the given
array.
 Note:- All array should be sent from calling functions,
Andl results should sent back to calling functions.
*/

class A
{
	public static void main(String[] args) // calling function
	{
		System.out.println("main starts.");
		int arrex4[] = {1,2,7,5,8,5,9,5,9,6};

		for (int i = 0;i<arrex4.length;i++ ) 
		{
		System.out.print(arrex4[i]+ " ");	
		}
		System.out.println();

		count(arrex4);

	
		System.out.println("main ends.");

	}

	public static int count(int[] arrex4) // called function
	{
		int givenNum = 5;

		int count = 0;

		for (int i=0;i<arrex4.length ;i++ ) 
		{
			int in = arrex4[i];
			if (in == givenNum ) 
			{
			 count++;	
			}
		}

		System.out.println(count);

		System.out.println("count end");
		return count;
	}
}