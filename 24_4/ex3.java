/*write a function to find the first 10 even square numbers.
*/
class ex3
{   public static void even10()
	{   int i = 1;
		int count = 20;
		int j = 1;
		for (j = 1;j<= count ; j++ ) 
	{
			
		
		{
			if (i%2==0) 
			{	System.out.print("count is "+j);
				System.out.print(" the number is "+i);
				int square = i*i;
				System.out.println(" and square is "+square);
			}
			i++;

		}
	}
		

	}

	public static void main(String[] args) 
	{
		even10();
			
	}
}