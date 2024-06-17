import java.util.Scanner;
class for_loop
{
public static void main(String[]args)
{
int a,i;
System.out.print("Enter any no: ");
Scanner s=new Scanner(System.in);
a=s.nextInt();
for(i=1;i<=10;i++)
{
System.out.println(a*i);
}
}
}