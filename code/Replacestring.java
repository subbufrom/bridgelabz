import java.util.*;
import java.util.regex.*;
public class Replacestring
{
public static void main(String [] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("enter the string ");
String username=scan.next();
Pattern p=Pattern.compile("[a-zA-Z]{3}");
Matcher m=p.matcher(username);
if(m.find())
{
System.out.println("hello "+username+" how are you?");
}
else
{
System.out.println("please enter alteast three characters");
}
}
}
