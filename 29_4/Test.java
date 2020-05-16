class Test 
{     
    // Driver method 
    public static void main(String args[])  
    { 
        int arr[] = {3, 1, 2, 5, 4}; 

        int arr1[] = {5,6,7,8,9};

          
        // passing array to method m1 
        sum(arr);
        Sum1(arr1); 
        
        
      
    } 
  
    public static void sum(int[] arr)  
    { 
        // getting sum of array values 
        int sum = 0; 
          
        for (int i = 0; i < arr.length; i++) 
            sum+=arr[i]; 
          
        System.out.println("sum of array values : " + sum); 
    } 

    public static void Sum1(int[]arr1)
    {
        int sum1 = 0;

        for (int i = 0 ;i < arr1.length ;i++ ) 
        {
         sum1+=arr1[i];   
        }
    System.out.println("sum of second array "+sum1);
        }
} 