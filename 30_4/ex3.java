
//float data type
class ex3
{
	public static void main(String[] args) 
	{
		System.out.println("main starts..");


		float arrayex3[] = {12.4f,23.4f,34.5f,45.6f,67.7f,78.9f,89.0f}; //declaration of array type float .
		arrayex3(arrayex3);

		System.out.println("main ends..");	
	}
	public static float[] arrayex3(float[] arrayex3)
	{
		for (int i = 0 ;i < arrayex3.length ;i++ ) // printing the arra values. float data type.
		{
			System.out.println("float element at index " + i + " : "+arrayex3[i]);	
		}
		return arrayex3;
	}
}