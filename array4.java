import java.util.Scanner;
import java.util.Arrays;

class Arr4
{
public static void main(String[]args)
{
int i,a[]=new int[5];
System.out.print("Enter Array elements: ");
Scanner s=new Scanner(System.in);
for(i=0;i<5;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
System.out.print("\n Array is: ");
for (int b:a)
{
System.out.print(b+ " ");
}
}
}
