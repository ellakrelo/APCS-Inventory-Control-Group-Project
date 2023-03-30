import java.util.Scanner;

public class Customer
	{
		static Scanner userInput = new Scanner(System.in);
		
		public static void inventory()
			{
				System.out.println("Current Inventory: ");
				System.out.println();
				
				// reads text file
				
				System.out.println("Search: ");
				String search = userInput.nextLine();
				searchCatalog(search);
			}
		
		public static void searchCatalog(String word)
			{
				String temp = "cat";
				String temp1 = "catalog";
				String temp2 = "vacation diary";
				
				// loops
				String name = temp2;
				
				for(int i = 0; i < name.length(); i++) 
					{
						int wordLength = word.length();
						
						if(i+wordLength <= name.length()) 
							{
							
							if(name.substring(i, i+wordLength).equals(word)) 
								{
									System.out.println("Check");
									break;
								}
							}
					}
			}
		
	
		
	}
