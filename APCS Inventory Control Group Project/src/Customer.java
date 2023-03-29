import java.util.Scanner;

public class Customer
	{
		static Scanner userInput = new Scanner(System.in);
		
		public void inventory()
			{
				System.out.println("Current Inventory: ");
				System.out.println();
				
				// reads text file
				
				System.out.println("Search: ");
				String search = userInput.nextLine();
				searchCatalog(search);
			}
		
		public void searchCatalog(String word)
			{
				String temp = "cat";
				String temp1 = "catalog";
				String temp2 = "vacation diary";
				
				for(int i = 0; i < word.length(); i++)
					{
						if(word.substring(i+1) != null && word.substring(i+2) != null) 
							{
								
							}
					}
			}
		
	
		
	}
