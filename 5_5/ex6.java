/*5} Dwsign a function which will return 
a array of non repeating characters.*/

class A
{
	public static void main(String[] args) 
	{

	
	

	}

	public static char[] input()
	{
		String s1 = "geeting batting happend";

		char[] c1 = s1.toCharArray();

		for (int i = 0;i<c1.length;i+=1 ) 
						{
				        System.out.println(c1[i]);
						}


		//String s1 = c1.toStringArray();
		 int l,r = 0;
		 r = c1.length-1;

		for (l = 0; l<r; l++,i--) 
		{
			if (c[l]==c[r]) 
			{
			break;	
			}
			
		}

		for (int i = 0;i<c.length;i+=1 ) 
				{
		        System.out.println(c[i]);
				}

				return;
	}
}