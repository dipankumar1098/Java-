import java.util.Scanner;
class Add
{
public static void main(String args[])
{
int a,b,c;
System.out.print("Enter any two integer: ");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=a+b;
System.out.print("Addition is: "+c);
}
}