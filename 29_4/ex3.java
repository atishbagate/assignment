/*3. Given a number from 1-12, 
return the name of the appropriate month.*/

class ex3
{
	public static void main(String[] args) 
	{ int num = 4; //value of month to find
		String[] months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};//declaration of array

		if (num >=1 && num <=12) { //loop for finding month in given number
			System.out.format("The name of month number %d is %s\n", num, months[num-1]); //use of format 

		//printing an whole array
		for (int j=1;j<months.length ;j++ ) {
			System.out.println("month number is-"+j+"and month is-"+months[j-1]);
			
		}
			
		}
	}
}