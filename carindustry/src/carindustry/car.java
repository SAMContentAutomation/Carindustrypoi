package carindustry;

import java.util.Scanner;

abstract class Carindustry{
	   
	   abstract public void brand();
	}
	public class car extends Carindustry{

	   public void brand() { 
		   System.out.println("Enter your choice:1)Ford 2)BMW");
		    Scanner sc = new Scanner(System.in);
		    int choice = sc.nextInt();	
	   
		    if(choice == 1)	 
		    {       
		    	Ford.ford();
		     }
		    else
		    {
		    	BMW.bmw();
		    }
	   }
	   public static void main(String args[])
	   { 
	 car obj = new car();
	 obj.brand();
	   }
	}