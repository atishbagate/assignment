/*write a function to find the odd qube numbers between 1 and 50.
*/

class ex4
{ public static void cube()
	{	int cub;
		int i,j = 1;
		for (j = 1;j<=50 ;j++ ) 
		{
			if (j%2!=0) 
			{
				System.out.print("odd number is "+j);
				cub = j*j*j;
				System.out.println(" cube is "+cub);
				
			}
			
		}
		j++;

	}

public static void main(String[] args) 
{
	cube();	
}

}