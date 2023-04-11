public class AccountingItem
  {
    private String name;
    private int accountCost;

    public AccountingItem(String n, int aC)
    {
      name = n;
      accountCost = aC;
    }

    public String getName()
		{
			return name;
		}

	public void setName(String name)
		{
			this.name = name;
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
