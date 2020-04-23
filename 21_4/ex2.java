//prog to print the write a program to print first 10 numbers which are divsible by 3 and 6.
// while is used when we dont know the starting and ending number

class ex2
{
	public static void main(String[] args) 
	{
		int i = 1;
		int count = 1;
		while(count <= 10) 
		{
			if(i%2==0 && i%6==0) // the given num is even
			{  System.out.println("count value..."+count);
				
				
				count+=1;
				
			}
			i++;

		}
	}
}