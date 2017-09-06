import java.util.*;
import java.util.regex.*;
public class Leapyear
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the year");
		int year=scan.nextInt();
		String tempyear=Integer.toString(year);
		Pattern p=Pattern.compile("[0-9]{4}");
		Matcher m=p.matcher(tempyear);
		if(m.find())
		{
			if(((year%4)==0 && (year%100)!=0) || (year%400)==0)
			{
				System.out.println("its a leap year");
			}
			else
			{
				System.out.println("its not a leap year");
			}
		}
		else
		{
			System.out.println("invalid year....!!!");
		}
	}
}
