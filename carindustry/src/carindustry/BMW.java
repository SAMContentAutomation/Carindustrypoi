package carindustry;

import java.util.Scanner;

public class BMW {
	public static void bmw()
	{
		System.out.println("Enter your choice:1)Ford 2)BMW");
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

