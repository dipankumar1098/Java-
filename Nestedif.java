import java.util.Scanner;
class Nestedif
{
public static void main(String[]args)
{
int a,b,c;
System.out.print("Enter three integers: ");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
b=obj.nextInt();
c=obj.nextInt();
if(a>b)
{
if(a>c)
{
System.out.print("greatest is "+a);
}
else
{
System.out.print("greatest is "+c);
}
}
else
{
if(b>c)
{
System.out.print("greatest is "+b);
}
else
{
System.out.print("greatest is "+c);
}
}
}
}
