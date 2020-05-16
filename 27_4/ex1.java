/*[a->] Design a function to return the area of square 
and print it in main function by
 taking the required inputs from calling menthod.*/

 class ex1
 {


 	public static void main(String[] args) //calling func
 	{
 		System.out.println("main starts...");

         double areaOfSquare,side;
         side = 10.04; 
        // in this side is given insteat of actual hard coded value for function.
        
        areaOfSquare = areaOfSquare(side);//actual aurgument
   		/*store the valule */
   		System.out.println("area of square");
		System.out.println(areaOfSquare);
         System.out.println("main ends...");
         return;
 		
 	}

 	public static double areaOfSquare(double side) //
 	{//called func 

 		System.out.println("areaOfSquare start");
 	//method is called and value type is initialized
	  double areaOfSquare = side*side;

 		System.out.println("areaOfSquare ends");
 		return areaOfSquare; // return value and pointer.
 	}
 }