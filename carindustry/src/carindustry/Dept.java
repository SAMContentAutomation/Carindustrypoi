package carindustry;

public class Dept {
	public static void dept()
	{
		System.out.println("Department");
		String[] str = new String[101];
		str[1] = "Finance & Cost Control";
		str[2] = "Sales and Marketing.";
		str[3] = "Production/Manufacturing";
		for(int i = 1 ;i<4;i++)
		{
			System.out.println("Department :"+str[i]);
		}
	}
}
