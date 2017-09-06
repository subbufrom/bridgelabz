import java.util.*;
public class Flipcoin
{
public static void main(String [] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the number of time to flip the coin ");
int n=scan.nextInt();
if(n>=0)
{
	int loopcount=1;
	double randomvalue=0;
	double tails=0;
	while(loopcount<=n)
	{
		randomvalue=Math.random();
		if(randomvalue<=0.5)
		{
			System.out.println("it tails");	
			++tails;
		}
		else
		{
			System.out.println("it heads");

		}
		++loopcount;
		
	}

	System.out.println("tails percentage is "+((tails/n)*100));
	System.out.println("heads percentage is "+(((n-tails)/n)*100));
}

else
{
	System.out.println("please enter the positive number");
}
}
}

