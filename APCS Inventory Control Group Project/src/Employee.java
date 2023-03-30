import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Employee
	{
		
		static Scanner userInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		static int intInput = 0;
		static String input = "";
		static Scanner inventory;
		static ArrayList<Item> inventoryArray = new ArrayList<Item>();
		
		public static void employeeMainMenu() throws IOException
		{
			System.out.println("Welcome valued employee! What would you like to do next?\n\t 1)List Inventory\n\t 2)View the accounting module\n\t 3)Log Out");
			intInput = userIntInput.nextInt();
			System.out.println();
			
			if(intInput == 1)
				{
					listInventory();
					input = userInput.nextLine();
				}
			else if(intInput == 2)
				{
					accountingModule();
					input = userInput.nextLine();
				}
			else if(intInput == 3)
				{
					System.out.print("Logging off");
					for(int i = 0; i < 3; i++) {
						
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.print(".");
					}
					System.out.println("");
					System.out.println();
					InventoryRunner.select();
				}
			else
				{
					System.out.println("I'm sorry, that is not an acceptable answer.");
					System.out.println();
					input = userInput.nextLine();
					employeeMainMenu();
					
				}
		}

		private static void accountingModule()
			{

				//tracks expenses 
				//show bottom line
			}

		private static void listInventory() throws IOException
			{

				inventory = new Scanner(new File("groupProject.txt"));
				
				while(inventory.hasNext())
					{
						int sku = inventory.nextInt();
						String name = inventory.next();
						int amount = inventory.nextInt();
						int retailCost = inventory.nextInt();
						int wholesaleCost = inventory.nextInt();
						
						inventoryArray.add(new Item(sku, name, amount, retailCost, wholesaleCost));
					}
				
				for(Item i : inventoryArray)
					{
						System.out.println(i.getName() + " " + i.getNumber() + " " + i.getRetailCost());
					}
			}
	}
