/*e] design a function which will take
 an array as input and return an new array 
 whith twice the size of original and the values copied twice in the new one.
eg->i/p [10,20,30]
    o/p [10,20,30,10,20,30]

    NOT SOLVED PROPERLY*/

 class A
 {
 	public static void main(String[] args) { //calling function
 		System.out.println("main start");

 		int arrayex5[] = {10,20,30,40,50}; 

	double1(arrayex5);
	clone(arrayex5);


 		System.out.println("main ends");
 	}

 	public static void double1(int[] arrayex5)
 	{
 		System.out.println("double start");

 		

 		for (int i=0;i<arrayex5.length ;i++ ) 
 		{
 			int val = arrayex5[i];
 		System.out.print(val);
 		System.out.print(" ");
 		System.out.print(val);
 		System.out.print(" ");	
 		
 		}
 		System.out.println(" ");



 		System.out.println("double ends");
 		return;
 	}
 	public static void clone(int[] arrayex5)
 	{
 		System.out.println("clone starts");

 		int arrayex5c[] = arrayex5.clone(); //cloned array

 		System.out.println("length of array before " +arrayex5c.length); 

 		int len = arrayex5c.length; // lenth of first array

 		int arrayex5b[] = new int[len*2]; //length multiplied

 		System.out.println("length of new array " +arrayex5b.length); //length of new array


 		arrayex5b[0] = 10;
 		arrayex5b[1] = 20;
 		arrayex5b[2] = 30;
 		arrayex5b[3] = 40;
 		arrayex5b[4] = 50;
 		arrayex5b[5] = 10;
 		arrayex5b[6] = 20;
 		arrayex5b[7] = 30;
 		arrayex5b[8] = 40;
 		arrayex5b[9] = 50;
 	

 		for (int i=0;i<arrayex5b.length ;i+=1 ) 
 		{
 			int val2 = arrayex5b[i];
 		System.out.print(val2);
 		System.out.print(" ");
 		

 		}
 		System.out.println(" ");



 		System.out.println("clone ends");
 		return;
 	}
 }