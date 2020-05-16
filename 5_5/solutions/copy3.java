class A
{
	public static void main(String[] args) {
		System.out.println("main starts..");

		String s1 = "stupid man";

		int countVovel = count(s1);

		System.out.println(countVovel);


		System.out.println("main ends..");
	}
	public static int count(String s1)
	{
		System.out.println("count starts..");
		int countVovel = 0;

		for (int i = 0;i<s1.length() ;i++ )
		{
			char c = s1.charAt(i);
		 if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') 
		 {
		 	countVovel++;		
		 }	
		}
		System.out.println("count ends..");

		return countVovel;
	}
}