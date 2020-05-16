/*d] design a function which takes 
an array of integers and return 
an new array with only even values in same positions 
and the odd ones replaced by 0.
eg->i/p [10,23,43]
    o/p [10,0,0]


    NOT SOLVED
    */

 class ex4
 {
 	public static void main(String[] args) 
 	{
 	System.out.println("main starts..");
 	int[] arrayex4 = {11,12,13,14,15,16,17,18,19,20};	

 	 int[] arrayex4Clone = odd(arrayex4);

 	 for (int i=0; i<arrayex4Clone.length; i++) 
            System.out.print(arrayex4Clone[i] + " "); 
        System.out.println(" ");


 	System.out.println("main ends");
 	}

 	

 	public static int[] odd(int[] arrayex4)
 	{
 		System.out.println("odd starts..");

 		System.out.print("array before clone = ");
 		for (int i=0; i<arrayex4.length; i++) 
            System.out.print(arrayex4[i] + " "); 
        System.out.println(" ");

        System.out.println("array after clone = ");

        int[] arrayex4Clone = new int[arrayex4.length];

         // Copy elements of a[] to b[] 
        for (int i=0; i<arrayex4.length; i++) 
            {
            	arrayex4Clone[i] = arrayex4[i];
            }


       System.out.print("array after clone =");

        for (int i=0; i<arrayex4Clone.length; i++) 
            System.out.print(arrayex4Clone[i] + " "); 
        System.out.println(" ");
            
        	
			for (int i = 0 ;i< arrayex4Clone.length ;i+=1 ) 
			{
				if (arrayex4Clone[i]%2 == 0) 
				{
					i++;					
				}
				if (arrayex4Clone[i]%2 != 0) 
				{
				 i++;		
					}	
			}
        

System.out.print("array after clone =");

        for (int i=0; i<arrayex4Clone.length; i++) 
            System.out.print(arrayex4Clone[i] + " "); 
        System.out.println(" ");

 		System.out.println("odd ends..");
 		return arrayex4Clone;
 	}
 }