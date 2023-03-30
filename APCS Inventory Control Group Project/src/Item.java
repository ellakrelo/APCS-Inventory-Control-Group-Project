
public class Item
	{
	private int sku; 
	private String name;
	private int number;
	private int retailCost;
	private int unitCost;
	//pojo for item
	public Item(int s, String n, int num, int retC, int unC)
		{
		sku = s;
		name = n;
		number = num;
		retailCost = retC;
		unitCost = unC;
		}

	public int getSku()
		{
			return sku;
		}

	public void setSku(int sku)
		{
			this.sku = sku;
		}

	public String getName()
		{
			return name;
		}

	public void setName(String name)
		{
			this.name = name;
		}

	public int getNumber()
		{
			return number;
		}

	public void setNumber(int number)
		{
			this.number = number;
		}

	public int getRetailCost()
		{
			return retailCost;
		}

	public void setRetailCost(int retailCost)
		{
			this.retailCost = retailCost;
		}

	public int getUnitCost()
		{
			return unitCost;
		}

	public void setUnitCost(int unitCost)
		{
			this.unitCost = unitCost;
		}
	
	}
