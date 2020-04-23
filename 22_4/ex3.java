class ex3
{
	public static void main(String[] args) 
	{
		int count = 1;		
		for ( int i = 1; i<=3;i++ ) 
		{ 
			for (int j = 1;j<=3 ;j++ ) 
			{
				if (count%2==0) 
				{
				System.out.print("#");	
				}
				else
				System.out.print("$");

				count++;

			
				
			}
		System.out.println();
		
		
			
		}
	}
}