/*A. Design a function to arrange the elements
/ of the array in ascending order.

Note:- All array should be sent from calling functions,
Andl results should sent back to calling functions.
*/

class A 
{
	public static void main(String[] args) //calling funtion
	{
		System.out.println("main starts..");
		
	int arrex1[] = {10,40,20,60,30,80,70,90};

		System.out.println("array before ascending order. = ");
	   for (int i = 0; i < arrex1.length; i++) 
	   {     
            System.out.print(arrex1[i] + " ");    
       }
       System.out.println();

       ascending(arrex1);    // array send to ascending method

   		 for (int i = 0; i < arrex1.length; i++) // array after ascending method
	   {     
            System.out.print(arrex1[i] + " ");    
       }
       System.out.println();

	System.out.println("main ends..");

	}

 	public static int[] ascending(int[] arrex1) //called function
	{
		System.out.println("ascending starts..");


		int temp = 0;
		for (int i = 0;i<arrex1.length ;i++ ) 
		{
			for (int j = i+1 ;j<arrex1.length ;j++ ) 
				{
					if (arrex1[i]>arrex1[j]) 
						{
							temp = arrex1[i];
							arrex1[i] = arrex1[j];
							arrex1[j] =  temp;
						}	
				}	
		}
		System.out.println("ascending ends..");

		return arrex1;
		  
    }  
        

        


 		
			
}
	



/*dry
 
 10> 40;
 false;
 40>20 true;
 temp = 40;
 40 = 20;
 arr 20 - 40;
 */
