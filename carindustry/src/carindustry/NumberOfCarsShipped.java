package carindustry;

import java.util.Scanner;

public class NumberOfCarsShipped {
	public static void numberOfCarsShipped()
	{
		String[] str = new String[101];
		str[1] = "2";
		str[2] = "0";
		str[3] = "10";
		for(int i = 1 ;i<4;i++)
		{
			System.out.println("NO of sales :"+str[i]+"cars");
		}
		System.out.println("Enter your choice:1)Date of shipment");
	    Scanner sc = new Scanner(System.in);
	    int choice = sc.nextInt();	
	    if(choice == 1)	 
	    {       
	    	DateofShipment.dateOfShipment();
	     }
	}

}
