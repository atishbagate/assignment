/*1. Write a Java method to find 
the smallest number among three numbers.*/

class ex1
{
	public static void main(String[] args) //calling Functional
	{
		System.out.println("main starts..");

		//declaration and initiialization of variable
		int num1, num2, num3 ;

		num1 = 10;
		num3 = 20;
		num2 = 30;

		//sending data and retriving back the min max values fron methods.
		int largerst = largerst (num1, num2, num3);

		int smallest = smallest (num1, num2, num3);

		System.out.println("smallest number = "+smallest);
		System.out.println("largerst number = "+largerst);
		System.out.println("main ends..");
		return;
	}


	public static int largerst (int num1, int num2, int num3)//called function
	{
		System.out.println("largerst Function starts..");
		int max = num1;

		if (num2 > max) {
			max = num2;
			
		}
		if (num3 > max) {
			max = num3;
			
		}

		System.out.println("largerst Function ends..");
		return max;

	}

	public static int smallest (int num1, int num2, int num3) //called function
	{
		System.out.println("smallest funtion starts..");

		int min = num1;

	

		if(num2 < min)
		{
			min = num2;
		}
		if (num3 < min) 
		{
			min = num3;	
		}
		System.out.println("smallest funtion ends..");
		return min;

	
	}

}


