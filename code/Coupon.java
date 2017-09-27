import java.util.*;
public class Coupon
{
public static void main(String [] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the number of coupons");
int n=scan.nextInt();
int count=getcount(n);
System.out.println("the random numbers required are "+count);
}

public static int getcount(int n)
{

boolean storecoupon[]=new boolean[n];
int distinct=0;
int count=0;
while(distinct<n)
{
	int coupon=getcoupon(n);
	++count;
	if(!storecoupon[coupon])
	{
	++distinct;
	storecoupon[coupon]=true;
	}
}
return count;
}

public static int getcoupon(int n)
{

return (int)(Math.random()*n);
}
//hello this is subbu
}
