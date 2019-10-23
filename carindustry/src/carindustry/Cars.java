package carindustry;


import java.util.Scanner;

public class Cars {
public static void cars()
{
	System.out.println("store");
	System.out.println("Enter your choice:1)Model 2)Color 3) Accessories ");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();	
    if(choice == 1)	 
    {       
    	Model.model();
     }
    else if(choice == 2)
    {
       Colour.colour();
    }
    else if(choice == 3)
    {
       Accessories.accessories();
    }
}
}
