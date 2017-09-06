import java.util.*;
public class Gambler
{
public static void main(String[] args)
{
int stake=0;
int goal=0;
int numberoftimes=0;
int wins=0;
Scanner scan=new Scanner(System.in);
System.out.println("enter the stake");
stake=scan.nextInt();
System.out.println("enter the goal");
goal=scan.nextInt();
System.out.println("enter no of times");
numberoftimes=scan.nextInt();
for(int i=0;i<numberoftimes;i++)
{
int cash=stake;
	while(cash>0 && cash <goal)
	{
		
		if(Math.random()<0.5)
		{
				++cash;
		}
		else
		{
				--cash;
		}
		if(cash==goal)
		{
		++wins;
		}
	}
}
System.out.println(wins+" wins of "+numberoftimes);
System.out.println("won percentage is "+(((float)(wins))/numberoftimes)*100);
System.out.println("loose percentage is "+(((float)(numberoftimes-wins))/numberoftimes)*100);
}
}







