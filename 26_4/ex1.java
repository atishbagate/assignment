/*[a->] Design a function to return 
the area of square and print it in main function. 
*/

class ex1
{
	

public static void main(String[] args) 
{	System.out.println("main start...");
 int areaOfSquare;
	int side = 4;
	areaOfSquare = areaOfSquare(4);
	System.out.println(areaOfSquare);
	System.out.println("main end...");
	return ;	
}

public static int areaOfSquare(int side)
	{	
		System.out.println("function start");
		int areaOfSquare;
		areaOfSquare = side*side;
		System.out.println("inside the function "+areaOfSquare);
		System.out.println("function end");
		return areaOfSquare;

	}
}