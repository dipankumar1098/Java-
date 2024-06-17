import java.util.Scanner;
class ternary
{
public static void main(String[]args)
{
int a,b,c;
System.out.print("Enter three integers: ");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

int r=(a>b)?(a>c?a:c):(b>c?b:c);
System.out.print("Greatest is: "+r);
}
}