/*
>write a program to print 
write a program to print first 15 numbers which are
 multiples of 7 but not divisible by 9.
*/


class ex5
{
	public static void main(String[] args) 
	{
		int i = 1;
		int count = 1;
		while(count <=5)
		{
			if (i%7 ==0 && i/9 !=0) 
			{
				System.out.println("count value ="+count);
				System.out.println(" multiples of 7 but not divisible by 9 ="+i);

				count+=1;
			}
			i++;
		}
		
	}
}