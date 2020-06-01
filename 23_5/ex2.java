/*company produced 
company product demand
average growth
positive or negative*/



class Company
{
	 String company_name;
	 String product_name;

	 int product_demand_shop1;
	 int product_demand_shop2;
	 int product_demand_shop3;
	 int company_produced;

	 int sumOfAll;
	 int value;



	 public  Company(String company_name,String product_name,
	 	int product_demand1,int product_demand_shop2,int product_demand_shop3,int company_produced)
	 {
	 	this(product_demand_shop1+product_demand_shop2+product_demand_shop3);

	 	this.company_name = company_name;
	 	this.product_name = product_name;
	 	this.company_produced = company_produced;

	 	return;
	 }

	 public Company(int sum)
	 {
	 	this(sum);
	 	sumOfAll = sum;
	 return;
	 }

	 public Company(int sum, int company_produced)
	 {
	 	value = sum - company_produced;
	 	return;

	 }

	 public  void show_data()
	 {
	 	System.out.println("---------------- Company details ----------");

	 	System.out.println("company_name = "+company_name+"Company product name = "+company_produced);
	 	System.out.println("shop demand 1 = "+product_demand_shop1+ "product_demand_shop 2 = "+product_demand_shop2+ "product_demand_shop 3 = "+product_demand_shop3);
	 	System.out.println("sum of all products requirement is = "+sumOfAll);
	 	System.out.println("value of prduction is = "+value);

	 	System.out.println("-------------------------------------------");

	 }


}


class info_input
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");

		Company c1 = new Company("samsung","mobiles",1000,2000,3000,50000);

		c1.show_data();

		System.out.println("main ends");	
	}
}