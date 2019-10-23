package carindustry;

import java.util.Scanner;

public class Employee {
	public static void employee()
	{
		System.out.println("Enter your choice:1)Salary 2)Dept ");
	    Scanner sc = new Scanner(System.in);
	    int choice = sc.nextInt();	
	    if(choice == 2)	 
	    {       
	    	Salary.salary();
	     }
	    else if(choice == 1)
	    {
	    	DeptEmployee.deptEmployee();
	    }
	}

}
