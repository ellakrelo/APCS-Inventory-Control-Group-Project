public class Item
	{
	private int sku; 
	private String name;
	private int number;
	private int retailCost;
	private int unitCost;
  private int idealStockNumber;
  private int accountCost;
	//pojo for item now 
	public Item(int s, String n, int num, int retC, int unC, int iSN)
		{
		sku = s;
		name = n;
		number = num;
		retailCost = retC;
		unitCost = unC;
    idealStockNumber = iSN;
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

    public int getIdealStockNumber()
    {
      return idealStockNumber;
    }

    public void setIdealStockNumber(int idealStockNumber)
    {
      this.idealStockNumber = idealStockNumber;
    }

    public int getAccountCost()
		{
			return accountCost;
		}

	public void setAccountCost(int accountCost)
		{
			this.accountCost = accountCost;
		}
    
	
	}
