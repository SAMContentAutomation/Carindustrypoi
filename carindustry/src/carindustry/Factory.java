package carindustry;

import java.util.Scanner;

 public class Factory {
	public static void factory()
	{
		System.out.println("factory");
		System.out.println("Enter your choice:1)Employee 2)Dept 3)Manufacture cost 4) cars");
	    Scanner sc = new Scanner(System.in);
	    int choice = sc.nextInt();	
	    if(choice == 2)	 
	    {       
	    	ManufactureCost.manufactureCost();
	     }
	    else if(choice == 1)
	    {
	    	Employee.employee();
	    }
	    else if(choice == 3)
	    {
	    	Dept.dept();
	    }
	    else if(choice == 4)
	    {
	    	CarsFactory.carsFactory();
	    }
	}
}
	
