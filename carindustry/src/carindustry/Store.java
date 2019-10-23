package carindustry;

import java.util.Scanner;

public class Store {
public static void store()
{
	System.out.println("store");
	System.out.println("Enter your choice:1)Cars 2)sale 3)Area");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();	
    if(choice == 1)	 
    {       
    	Cars.cars();
     }
    else if(choice == 2)
    {
       Sale.sale();
    }
    else if(choice == 3)
    {
       Area.area();
    }
}
	}
