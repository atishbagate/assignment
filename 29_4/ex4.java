//4. Given a number from 1-7, return the name of the appropriate week.
class ex4
{
	public static void main(String[] args) {
		System.out.println("main start");
		int num = 3;
		String[] day = {"sunday","monday","tuesday","wenesday","thurday","friday","Saterday"};//arrray created 

		for (int i =1;i<day.length ;i++ ) { //printing an array 
			System.out.println("day number - "+i+" and day is - "+day[i-1]);
			}
			//finding the number at given number.
		if (num>=1 && num <=7) {
			System.out.format("the name of day number %d is %s\n",num,day[num-1]);
			
		}

		System.out.println("main ends");
	}
}