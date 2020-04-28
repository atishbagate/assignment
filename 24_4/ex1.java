/*write a function to find the sum of first 10 odd multiples of 3.*/

class ex1
{
	public static void sum()
	{
		int i = 1;
		int count = 1;
		int sum1 = 0;
		while(count<=10)
		{
			if (i%3==0 && i%2!=0) 
			{
				System.out.print("odd multiples of 3 count "+count);
				System.out.print(" is "+i);
				count+=1;

				sum1 = sum1+i;
				System.out.println(" sum is "+sum1);

			}
		i++;
		
		}
	}

	public static void main(String[] args) 
	{
		sum();
	}
}


/*dry run */