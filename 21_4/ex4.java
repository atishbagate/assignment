/*
>write a program to print 
first 5 numbers which are not multiples of 2 and 5.
*/


class ex4
{
	public static void main(String[] args) 
	{
		int i = 1;
		int count = 1;
		while(count <=5)
		{
			if (i%2 !=0 && i%5 !=0) 
			{
				System.out.println("count value ="+count);
				System.out.println("numbers which are not multiples of 2 and 5. ="+i);

				count+=1;
			}
			i++;
		}
		
	}
}