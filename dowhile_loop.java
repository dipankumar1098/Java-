import java.util.Scanner;
class dowhile_loop
{
public static void main(String[]args)
{
int a;
System.out.print("Enter any no: ");
Scanner s=new Scanner(System.in);
a=s.nextInt();
do
{
System.out.print("Hello programmer");
}
while(a<3);
}
}