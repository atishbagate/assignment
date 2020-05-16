/*
B. Design a function
 to arrange the elements of the array in descending order.

 Note:- All array should be sent from calling functions,
Andl results should sent back to calling functions.
*/

 class A
 {
 	public static void main(String[] args) 
 	{
	 	System.out.println("main starts..");
	 	
		 	int arrex2[] = {20,50,60,20,70,10,90,40,30,80};
		 	for (int i = 0 ;i < arrex2.length ;i++ ) 
		 	{
		 		System.out.print(arrex2[i] + " ");
		 	}
		 	System.out.println();
		 descending(arrex2); //sending arrex2 to descending method.	
 		
		 //int[] arrex3 = descending(arrex2); initialize new array "arrex3" and put the value of arrex2 in it.
		 for (int i = 0 ;i < arrex2.length ;i++ ) 
		 	{
		 		System.out.print(arrex2[i] + " ");
			}
			System.out.println();
	 	System.out.println("main ends..");	
	 

 	}


 	public static int[] descending(int[] arrex2) //called function
 	{
 		System.out.println("descending starts..");

 		int temp = 0;

 		for (int i = 0;i<arrex2.length;i++ ) 
 		{
 			for (int j = i+1;j<arrex2.length;j++ ) 
 				{
 					if (arrex2[i]<arrex2[j]) 
 					{
 						temp = arrex2[i];
						arrex2[i] = arrex2[j];
						arrex2[j] =  temp;
 					}	
 				}	
 		}

 		
 		System.out.println("descending ends..");

 		return arrex2;

 	
 	}


 }