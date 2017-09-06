import java.util.*;
public class Powerof2
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
if(n>=0)
{

	for(int i=0;i<=n;i++)
	{
	System.out.println("2 power of "+i+" is "+Math.pow(2,i));
	}
}
else{
System.out.println("please enter the positive number");
}
}
}
