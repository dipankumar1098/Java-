import java.util.Scanner;
class calculator
{
public static void main(String[]args)
{
int a,b,c,ch;
System.out.print("Enter 2 no: ");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
System.out.println("What do you want: 1 for Addition");
System.out.println(" 2 for Subtraction");
System.out.println(" 3 for Multiplication");
System.out.println(" 4 for Division");
ch=s.nextInt();
switch(ch)
{
case 1:c=a+b;
System.out.print("Addition is: "+c);
break;
case 2:c=a-b;
System.out.print("Subtraction is: "+c);
break;
case 3:c=a*b;
System.out.print("Multiplication is: "+c);
break;
case 4:c=a/b;
System.out.print("Division is: "+c);
break;
default:
System.out.print("Invalid choice");
}
}
}







