package carindustry;

import java.util.Scanner;

public class Ford {
public static void ford()
{
	System.out.println("Enter your choice:1)Store 2)Factory");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();	
    if(choice == 1)	 
    {       
    	Store.store();
     }
    else
    {
    	Factory.factory();
    }
}
}

