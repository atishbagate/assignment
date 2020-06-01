class Model
{
String modelName;
int modelId;
String specs;
int productionPrice;
int showRoomPrice;
int gst;
int profit;

	public Model(String modelName,int modelId,String specs,
int productionPrice,int showRoomPrice, int gst)
	{
		this.modelName = modelName;
		this.modelId = modelId;
		this.specs = specs;
		this.productionPrice = productionPrice;
		this.showRoomPrice = showRoomPrice;
		this.gst = gst;

		 this.profit = profit(productionPrice,showRoomPrice);

	return;
	}
	public static int profit(int productionPrice, int showRoomPrice)
	{
		int profit = (showRoomPrice - productionPrice);
	return profit;
	}


	public void showData()
	{
		System.out.println("---------------- Model details ----------");
		System.out.println("modelName = "+modelName);
		System.out.println("modelId = "+modelId);
		System.out.println("specs = "+specs);
		System.out.println("productionPrice = "+productionPrice);
		System.out.println("showRoomPrice = "+showRoomPrice);
		System.out.println("gst "+gst);
		System.out.println("profit = "+profit);
		System.out.println("----------------ends-------------------------");
	return;
	}
}

class A
{
	public static void main(String[] args) {
		System.out.println("main starts");

       Model m1 = new Model("bullet",123,"good bike",123456,1234567,23);
       m1.showData();
		System.out.println("main ends");
	}
}