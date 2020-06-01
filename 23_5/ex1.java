class Owner
{
	String sensex_rate_name;

	int high;
	int low;
	double avg;
	double percentage;


	public Owner(String sensex_rate_name,int high,int low)
	{
		this(high + low);

		this.high = high;
		this.low = low;
	return;
	}

	public Owner(double sum)
	{
		this(sum,23.90);
		avg = sum/2;
	return;
	}

	public Owner(double sum, double total)
	{
		percentage = (sum/total)*100;
	return;
	}

	public void show_data()
	{
		System.out.println("---------------- Owner stock details ----------");
		System.out.println("name of owner = "+sensex_rate_name);
		System.out.println("high value = "+high+" and low value is = "+low);
		System.out.println("average = "+avg);
		System.out.println("percentage = "+percentage);

		System.out.println("---------------- Owner stock details ----------");
	return;
	}
}

class info_input{
	public static void main(String[] args) {
		System.out.println("main starts");

		Owner s1 = new Owner("Sumit",10,20);
		s1.show_data();

		System.out.println("main ends");
	}
}
