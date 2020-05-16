/*5} Design a function which will return an array of non repeating characters. 

i/p -> "idiots"
o/p -> [d,o,t,s]

------------ Algorithem ----------------
func[to convert String to array]         -> i/p string  = "idiots"
                                            o/p array    = [i,d,i,o,t,s]

func[sort the array]                    -> i/p array = [i,d,i,o,t,s]
                                           o/p array = [d,i,i,o,s,t]

func[create an array with unique chars] -> i/p array = [d,i,i,o,s,t]
                                           o/p array = [d,o,t,s,_,_]
----------- optional -------------
func[remove empty elements]             -> i/p array = [d,o,t,s,_,_]
                                           o/p array = [d,o,t,s]
*/

class A
{
	public static void main(String[] args) 
	{
	System.out.println("main starts..");

	String data = "idiots";

	convert(data); 

	System.out.println("main ends..");	
	}
	public static char[] convert(String data)
	{
		System.out.println("convert starts..");
		char[] array = data.toCharArray();

		for (int i=0;i<array.length ;i++ ) 
		{
		System.out.println(array[i]);	
		}

		System.out.println("convert ends..");

		sort(array);

	return array;
	}

	public static char[] sort(char[] array)
	{
		System.out.println("sort starts");

	for (int i = 0;i<array.length ;i++ ) 
	{
		for (int j = i+1;j<array.length;j++ ) 
		{
		if (array[i]>array[j]) 
			{
				
		 char temp = array[i];
		 array[i] =  array[j];
		 array[j] = temp;	
			}	
		}
	}

		for (int i=0;i<array.length ;i++ ) 
		{
		System.out.println(array[i]);	
		}

		System.out.println("sort ends..");

		unique(array);
		return array;
	}

	public static char[] unique(char[] array)
	{
		System.out.println("unique starts..");


	char [] array1 = new char[array.length];

	int j=0;

		for (int i = 0;i<array.length-1 ;i++ ) 
	{
		if (array[i] != array[i+1]) 
		{
			array1[j] = array[i];
			j+=1;	
		}
	}

	array1[j] = array[array.length-1];
		
		System.out.println("length of old array"+array.length);
		System.out.println("length od new array" +array1.length);

		for (int i=0;i<array.length ;i++ ) 
		{
		System.out.println(array[i]);	
		}

		char[] array2 = new char[j+1];

		for (int i = 0;i<array2.length ;i+=1 ) 
		{
			array2[i] = array1[i];	
		}


		for (int i=0;i<array2.length ;i++ ) 
		{
		System.out.println(array2[i]);	
		}

		System.out.println("unique ends..");
		return array2;
	}

}