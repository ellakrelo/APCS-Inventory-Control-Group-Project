import java.util.ArrayList;
import java.util.Scanner;

public class Customer
	{
		static Scanner userInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
		static ArrayList<Item> shoppingCart = new ArrayList<Item>();
		static int itemsPurchased = 0;
		
		public static void currentInventory()
			{
				System.out.println("Current Inventory: ");
				System.out.println();
				
				int i = 1;
				for(Item x : InventoryList.list)
					{
						if(x.getNumber() > 0)
							{
								System.out.println(i + ". " + x.getName() + " x " + x.getNumber() + " Price: $" + x.getRetailCost());
								i++;
							}
						
						
					}
				i++;
				System.out.println(i + ". Search Feature");
				System.out.println();
				System.out.println("Input: ");
				int search = userInput.nextInt();
				
				if(search > 0 && search < i)
					{
						addToShoppingCart(search-1);
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
		
		public static void searchCatalog()
			{
				
				System.out.println("Search: ");
				String word = userStringInput.nextLine();
				
				int i = 1;
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
												
												System.out.println(i + ". " + x.getName() + " x " + x.getNumber() + " Price: $" + x.getRetailCost());
												i++;
											}
									}
							}
						
					}
				int search = userInput.nextInt();
				if(search > 0 && search < i+1)
					{
						addToShoppingCart(search-1);
					}
				else
					{
						System.out.println("That was not an acceptable answer");
						search = userInput.nextInt();
						searchCatalog();
					}
			}
		
		public static void addToShoppingCart(int i)
			{
				
				
				shoppingCart.add(new Item(InventoryList.list.get(i).getSku(), InventoryList.list.get(i).getName(), InventoryList.list.get(i).getNumber(), 
						InventoryList.list.get(i).getRetailCost(), InventoryList.list.get(i).getUnitCost()));
				// subtract from inventory
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
		
		public static void checkOut()
			{
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
				currentInventory();
			}
	
		
	}
