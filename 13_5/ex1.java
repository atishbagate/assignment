/*-------------------------------------------------------------------------
create a Mobile class with it's features and functions.
create a Owner class who access the mobile functions and features 

1] In Mobile class all the data and function members should be static.
2] In Mobile class all the data and function members should be non-static.
-------------------------------------------------------------------------*/

class Mobile
{
	static String Brand = " samsung ";
	static String Model = " M-20 ";
	static String CameraSpec = " 20 MP+ 8MP dual camera ";
	static String Display = " 6.3 inch amoled Display ";
	static int YearOfLaunch = 2019;
	static String Ram = " 3 GB RAM ";
	static int Price = 12000;
	static String SiteOfPurchase = "flipkart";
	static float Discount = 20.00f;


	public static void VedioCall()
	{
		System.out.println(" Mobile "+Model+" have great vedio and audio quality because of : "+CameraSpec);

	} 
	public static void Display()
	{
		System.out.println(" mobile "+Model+ " have great Display quality "+Display);
	}
	public static void Performance()
	{
		System.out.println(" Model "+Model+" has great performance because of "+Ram);
	}
}


class Owner
{
	public static void main(String[] args) 
	{
		System.out.println("Name of my mobile Brand is "+Mobile.Brand+ " model name is "+Mobile.Model+ " it has great specifications ");

		System.out.println(" I get it from "+Mobile.SiteOfPurchase+ " for price of "+Mobile.Price+ " at Discount of "+Mobile.Discount);

		System.out.println("its functions are as follows = ");
		Mobile.VedioCall();
		Mobile.Display();
		Mobile.Performance();
	}
}