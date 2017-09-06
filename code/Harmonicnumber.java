import java.util.*;
public class Harmonicnumber
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
double sum=0.0;
if(n>=0)
{
for(int i=1;i<=n;i++)
{
sum=sum+(1.0/i);
}
System.out.println("the "+n+"th harmonic value "+sum);
}
else
{
System.out.println("enter the positive number");
}
}
}
