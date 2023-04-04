

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
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
	        name.replaceAll("[\\s\\-()]", " ");
	        int number = file.nextInt();
	        int retailCost = file.nextInt();
	        int manCost = file.nextInt();
	        list.add(new Item(sku, name, number, retailCost, manCost));
	        }
		}
	}
