import java.util.Scanner;
class whileloop
{
public static void main(String[]args)
{
int a;
System.out.print("Enter any no: ");
Scanner s=new Scanner(System.in);
a=s.nextInt();
while(a>0)
{
if(a%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}
}