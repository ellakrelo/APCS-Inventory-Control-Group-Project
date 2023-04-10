import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer
	{
		static Scanner userInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
		static ArrayList<Item> shoppingCart = new ArrayList<Item>();
		static int itemsPurchased = 0;
		
		public static void currentInventory() throws IOException
			{
				System.out.println("Current Inventory: ");
				System.out.println("------------------------------------------------------------------------------------");
				int i = 0;
				for(i = 0; i < InventoryList.list.size(); i++)
					{
					System.out.println("#" + i + ": " + InventoryList.list.get(i).getName() + " -- $" + InventoryList.list.get(i).getRetailCost());
					System.out.println("Quantity: " + InventoryList.list.get(i).getNumber() );
					System.out.println("SKU:" + InventoryList.list.get(i).getSku());
					System.out.println("------------------------------------------------------------------------------------");
					
					}
				System.out.println(i + ". Search Feature");
				System.out.println();
				System.out.println("Input: ");
				int search = userInput.nextInt();
				
				if(search > 0 && search < i)
					{
						addToShoppingCart(search);
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
				
				System.out.println("Search: ");
				String word = userStringInput.nextLine();
				
				String option = "";
 				int i = 0;
 				System.out.println("------------------------------------------------------------------------------------");
				for(Item x : InventoryList.list)
					{
						
						String name = x.getName().toLowerCase();
						
						
						for(int j = 0; j < name.length(); j++)
							{
								int wordLength = word.length();
								
								if(j+wordLength <= name.length())
									{
										if(name.substring(j, j + wordLength).equals(word))
											{
												System.out.println("#" + i + ": " + x.getName() + " -- $" + x.getRetailCost());
												System.out.println("Quantity: " + InventoryList.list.get(i).getNumber() );
												System.out.println("SKU:" + InventoryList.list.get(i).getSku());
												System.out.println("------------------------------------------------------------------------------------");												
												name = "";
												option += i;
											}
									}
							}
						i++;
					}
				System.out.println("Input: ");
				int search = userInput.nextInt();
				String[] split = option.split("");
				if(search > 0)
					{
						boolean test = true;
						for(int x = 0; x < split.length; x++)
							{
								if(search == Integer.parseInt(split[x]))
									{
										test = false;
										addToShoppingCart(search);
										
									}
							}
						if(test == true)
							{
								System.out.println("Item not found in search.");
								searchCatalog();
							}
						
						
					}
				else
					{
						System.out.println("That was not an acceptable answer");
						search = userInput.nextInt();
						searchCatalog();
					}
			}
		
		public static void addToShoppingCart(int i) throws IOException
			{
				
				
				shoppingCart.add(new Item(InventoryList.list.get(i).getSku(), InventoryList.list.get(i).getName(), InventoryList.list.get(i).getNumber(), 
						InventoryList.list.get(i).getRetailCost(), InventoryList.list.get(i).getUnitCost()));
				
				InventoryList.list.get(i).setNumber(InventoryList.list.get(i).getNumber() -1);
				InventoryList.writeToList();
				
				System.out.println(shoppingCart.get(itemsPurchased).getName() + " has been added to your shopping cart.");
				itemsPurchased++;
				
				
				System.out.println("Would you like to continue shopping? (1) Yes (2) No");
				int input = userInput.nextInt();
				if(input == 1)
					{
						currentInventory();
					}
				else if(input == 2)
					{
						checkOut();
					}
				else
					{
						System.out.println("That was not an acceptable answer");
						input = userInput.nextInt();
						currentInventory();
					}
			}
		
		public static void checkOut() throws IOException
			{
				Thread thread = new Thread();
				long sleep = 1000;
				
				System.out.println();
				System.out.println("Shopping Cart: ");
				int totalPrice = 0;;
				for(Item x : shoppingCart)
					{
						System.out.println(" " + x.getName() + "... $" + x.getRetailCost());
						totalPrice += x.getRetailCost();
					}
				System.out.println("Total Price: $" + totalPrice);
				
				System.out.println("You buy the items.");
				
				// subtract from account
				
				try
					{
						Thread.sleep(sleep);
					}
				catch(InterruptedException e)
					{
					}
				
				System.out.println("Would you like to go shopping again? (1) Yes (2) No");
				int input = userInput.nextInt();
				if(input == 1)
					{
						currentInventory();
					}
				else 
					{
						System.out.println();
						InventoryRunner.main(null);
					}
			}
	
		
	}
