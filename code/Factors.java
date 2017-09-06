import java.util.*;
public class Factors
{
public static void main(String [] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the number to find prime factors");
int n=scan.nextInt();
while(n%2==0)
{
System.out.println(2 +" ");
n=n/2;
}
for(int i=3;i<=Math.sqrt(n);i+=2)
{
	while(n%i==0)
	{
	System.out.println(i +" ");
	n=n/i;
	}
}
if(n>2)
{
System.out.println(n);
}
}
}
