import java.io.*;
import java.util.*;

public class AccountingSystem
  {
    static ArrayList<AccountingItem> accountList = new ArrayList<AccountingItem>();
    static Scanner file;
    
    public static void fillAccounts() throws IOException
    {
      file = new Scanner(new File("accounting.txt"));
      
      while(file.hasNext())
        {
          String name = file.next();
          int accountCost = file.nextInt();
          accountList.add(new AccountingItem(name, accountCost));
        }
    }

    public static void writeToAccount() throws IOException
    {
      System.out.println(accountList.get(0).getAccountCost());
      BufferedWriter bw = new BufferedWriter(new FileWriter("accounting.txt"));
      
      for(AccountingItem i : accountList)
        {
          String name = i.getName();
          String number = String.valueOf(i.getAccountCost()) + "";

          bw.write(name + " " + number);
          bw.newLine();
        }
      
      bw.close();
      
    }
  }
