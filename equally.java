import java.util.*;
class equally
{
public static void main(String[] args)
{
String a,b;
Scanner s=new Scanner(System.in);
System.out.println("Enter any name: ");
a=s.nextLine();
System.out.println("Enter another name: ");
b=s.nextLine();
if(a.equals(b))
{
System.out.print("both are same");
}
else
{
System.out.print("both are different");
}
}
}