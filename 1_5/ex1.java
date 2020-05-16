/*a] design a function to which accepts
 a array of integrs and returns its average value.
eg->i/p [10,20,30] 
    o/p   20
*/

class ex1
{
	public static void main(String[] args)  // calling function
	{
		System.out.println("main starts..");
	
		int arrayex1[] = {10,20,30,40,50,60,70,80,90,100};

	double average = average(arrayex1);
	System.out.println("average is : "+average);

		System.out.println("main ends..");
		return;

	}

	public static double average(int[] arrayex1) // called function 
	{
		System.out.println("average starts..");

		System.out.println("length of an array : ");
		System.out.println(arrayex1.length);

		int sum = 0;
		for (int num : arrayex1)  // for loop for sum 
		{
			sum = sum+num;
		}
		System.out.println("sum of array element : "+sum);

		double average = sum/arrayex1.length;  // for finding average

		System.out.println("average ends..");
		return average; 
	}


}