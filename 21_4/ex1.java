//prog to print the first 10 numbers divisible by 5
// while is used when we dont know the starting and ending number
// just we know the counter (count) of the program that is first 10.
class ex1
{
	public static void main(String[] args) 
	{
		int i = 1; // initial i value
		int count = 1; // initial counter
		while(count <= 10) //first 10 numbers
		{
			if(i%5==0) // the given num is divisible by 5 
			{  System.out.println("count value..."+count);
				
				System.out.println("divisible by 5...."+i);
				
				count+=1;
				
			}
			i++;

		}
	}
}