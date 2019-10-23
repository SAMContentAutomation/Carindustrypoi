package carindustry;

public class Amount {
public static void amount()
{
	String[] str = new String[101];
	str[1] = "7.81 - 11.35";
	str[2] = "5.88 - 9.0 Lakh";
	str[3] = "74.63 Lakh";
	for(int i = 1 ;i<4;i++)
	{
		System.out.println("Amount:"+str[i]+"Rupees");
	}
}
}
