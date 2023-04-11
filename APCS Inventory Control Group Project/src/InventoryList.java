import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class InventoryList
	{

  static Scanner file;
	static ArrayList<Item> list = new ArrayList<Item>();
  
	
	public static void fillList() throws IOException
		{
		file = new Scanner(new File("groupProject.txt"));
		int numberOfLines = file.nextInt();      
	    file.nextLine();
	    for( int i = 0; i < numberOfLines; i++ )
	    	{
	        int sku = file.nextInt();
	        String name = file.next();
	        
	        int number = file.nextInt();
	        int retailCost = file.nextInt();
	        int manCost = file.nextInt();
          int stockNum = file.nextInt();
	        list.add(new Item(sku, name, number, retailCost, manCost, stockNum));
	        }
		}

	public static void writeToList() throws IOException
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter("groupProject.txt"));
			bw.write("10");
			bw.newLine();
			
			for(Item x : InventoryList.list)
				{
					String sku = String.valueOf(x.getSku()) + "";
					String name = x.getName();
					String number = String.valueOf(x.getNumber()) + "";
					String retailCost = String.valueOf(x.getRetailCost()) + "";
					String unitCost = String.valueOf(x.getUnitCost()) + "";

          String stockNum = String.valueOf(x.getIdealStockNumber()) + "";
				
					bw.write(sku + " " + name + " "  + number + " " + retailCost + " " + unitCost + " " + stockNum);
				
					bw.newLine();
				}
			bw.close();
		
		}
	

public static void stockCheck() throws IOException
  {
  for(int i = 0; i < list.size(); i++)
    {
      if(list.get(i).getNumber() <= 5)
      {
        int difference = (list.get(i).getIdealStockNumber() - list.get(i).getNumber()) * list.get(i).getRetailCost();
          list.get(i).setNumber(list.get(i).getIdealStockNumber());

        AccountingSystem.accountList.add(new AccountingItem(list.get(i).getName(), 0 - difference));
      }
    }

    writeToList();
  }
}
