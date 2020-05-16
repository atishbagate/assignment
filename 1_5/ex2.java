/*b] design a function which 
accepts an array of charecters and returns an array with the reverse characters.
eg->i/p ['b','h','k'] 
    o/p ['k','b'.'h']*/

   class ex2
   {

   	public static void main(String[] args) 
   	{

   	System.out.println("main starts..");
   	
   	char arrayex2[] = {'a','b','c','d','e','f','g','h'};

   	reverse(arrayex2); 
      System.out.println("after reverse");
      for ( int i = arrayex2.length-1 ;i>=0 ;i-- ) 
         {
         System.out.println("char element at index  : "+arrayex2[i]); 
         }

   	System.out.println("main ends..");

   	}

   	public static char[] reverse(char[] arrayex2)
   	{
   		System.out.println("reverse starts..");

   		for (int i = 0;i< arrayex2.length ;i++ ) 
   		{
   		
   		System.out.println("char element at index "+i+" : "+arrayex2[i]);	
   		}

   		System.out.println("reverse order");

   		for ( int i = arrayex2.length-1 ;i>=0 ;i-- ) 
   		{
   		System.out.println("char element at index "+i+" : "+arrayex2[i]);	
   		}

   		

   		System.out.println("reverse ends..");
         return arrayex2;
   	
   	
   	}
   }