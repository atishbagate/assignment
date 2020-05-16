/*2. Write a Java method to compute the average of three numbers,
 return true if the average is even else return false.*/

class ex2
{
	public static void main(String[] args) //calling function

	{
	System.out.println("main starts..");	

	int num1,num2,num3; //initialization and declaration of variables
	num1 = 10;
	num2 = 20;
	num3 = 30;

  //sending information to function and retriving back values
	double average = average(num1,num2,num3);

	System.out.println("average of 3 numbers : "+average);
	
  //sending value to bol function and retriving back the boolean value and printing it in main method
	boolean bol = bol(average);
	System.out.println("average is even = "+bol);

	System.out.println("main ends..");
	return;
	}

	public static double average (int num1, int num2, int num3) //called function
	{
		System.out.println("average is started..");

		double average = (num1+num2+num3)/3;

		System.out.println("average is end..");
		return average;
	}

	public static boolean bol(double average) //called function
	{
		if (average/2==0) {
			return true;
		}
		else {
			return false;
		}
		

	}
}



