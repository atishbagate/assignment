/*write a function to find the even multiples of 5&7 between 10 and 100.*/


class ex2
{
	public static void multiple()
{
	for (int i = 10;i<= 100 ;i++ ) 
	{
		if (i%5==0 && i%7==0) 
		{
			if (i%2==0) 
			{
				System.out.println("the even multiple of 5&7 between 10 and 100."+i);	
			}

			
		}
		
	}
}

	public static void main(String[] args) 
	{
		multiple();
		
	}
}