import java.util.*;

public class InventoryRunner
	{

		static Scanner userInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		static int intInput = 0;
		static String input = "";
		static String password = "totallyStrongPassword";
		
		public static void main(String[] args)
			{
				select();
			}
		
		public static void select()
		{
			System.out.println("Welcome! Are you a customer or an employee?");
			System.out.println("\t 1) Customer");
			System.out.println("\t 2) Employee");
			intInput = userIntInput.nextInt();
			
			if(intInput == 1)
				{
					//customer selection
				}
			else if(intInput == 2)
				{
					password();
				}
			else
				{
					System.out.println("That was not an acceptable answer");
					input = userInput.nextLine();
					select();
				}
			
			
		}
		
		public static void password()
		{
			System.out.println("Please enter your password");
			input = userInput.nextLine();
			
			if(password.equals(input))
				{
					//employee selection
				}
			else
				{
					System.out.println("That was not correct. Would you like to try again?\n\t 1) Yes\n\t 2) No");
					intInput = userIntInput.nextInt();
					
					if(intInput == 1)
						{
							password();
						}
					else if(intInput == 2)
						{
							select();
						}
					else
						{
							System.out.println("That was not an acceptable answer");
							input = userInput.nextLine();
							select();
						}

				}
		}

	}
