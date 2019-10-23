package carindustry;

import java.util.Scanner;

public class CarsFactory {
	public static void carsFactory()
	{
		System.out.println("Enter your choice:1)Number of cars shipped 2)Number of car manufactured 3)Start-End date ");
	    Scanner sc = new Scanner(System.in);
	    int choice = sc.nextInt();	
	    if(choice == 1)	 
	    {       
	    	NumberOfCarsShipped.numberOfCarsShipped();
	     }
	    else if(choice == 2)
	    {
	    	NumberOfCarsManufactured.numberOfCarsManufactured();
	    }
	    else if(choice == 3)
	    {
	       StartEndDate.startEndDate();
	    }
		
	}
}
