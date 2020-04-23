/*
write a program to print first 5 numbers which are not multiples of 2 and 5.

*/

class ex3
{
	public static void main(String[] args) 
	{
		int i = 1;
		int count = 1;
		while(count <= 5) 
		{
			if(i%4 != 0) // the given num is not a multiple of 4
			{  System.out.println("count value..."+count);
				
				System.out.println("number not a multiple of 4...."+i);
				
				count+=1;
				
			}
			i++;

		}
	}
}