class A
{
	public static void main(String[] args) {
		System.out.println("main stars..");

		String data = "domanics";

		String rs = reverse(data);
		System.out.println(rs);

		System.out.println("main ends..");
	}

	public static String reverse(String data)
	{
		System.out.println("reverse starts..");

		String rs = "";

		for (int i = data.length()-1; i>=0 ;i-- ) 
		{
			rs = rs + data.charAt(i);	
		}

		System.out.println("reverse ends..");
		return rs;
	}
}