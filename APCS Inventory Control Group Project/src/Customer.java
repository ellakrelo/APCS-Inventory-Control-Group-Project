import java.io.IOException;
import java.util.Scanner;

public class Customer
	{
		static Scanner userInput = new Scanner(System.in);
		
		public static void currentInventory() throws IOException
			{
				System.out.println("Current Inventory: ");
				System.out.println();
				
				int i = 1;
//				for(Item x : InventoryList.list)
//					{
//						if(x.getNumber() > 0)
//							{
//								System.out.println(i + ". " + x.getName() + " x " + x.getNumber() + " Price: $" + x.getRetailCost());
//								i++;
//							}
//						
//						
//					}
				i++;
				System.out.println(i + ". Search Feature");
				System.out.println();
				System.out.println("Search: ");
				int search = userInput.nextInt();
				
				if(search > 0 && search < i)
					{
						addToShoppingCart();
					}
				else if(search == i)
					{
						searchCatalog();
					}
				else
					{
						System.out.println("That was not an acceptable answer");
						search = userInput.nextInt();
						currentInventory();
					}
				
				
				
			}
		
		public static void searchCatalog() throws IOException
			{
				String temp = "cat";
				String temp1 = "catalog";
				String temp2 = "vacation diary";
				
				String word = userInput.nextLine();
				
				int i = 0;
//				for(Item x : InventoryList.list)
//					{
//						String name = x.getName();
//						
//						for(int j = 0; j < name.length(); j++)
//							{
//								int wordLength = word.length();
//								
//								if(j+wordLength <= name.length())
//									{
//										if(name.substring(j, j + wordLength).equals(word))
//											{
//												System.out.println(i + ". " + x.getName() + " x " + x.getNumber() + " Price: $" + x.getRetailCost());
//												break;
//											}
//									}
//							}
//					}
				
				

			}
		
		public static void addToShoppingCart()
			{
				
			}
	
		
	}
