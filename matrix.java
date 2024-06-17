import java.util.Scanner;
import java.util.Arrays;

class matrix
{
public static void main(String[]args)
{
int i,j,a[][]=new int[2][2];
System.out.print("Enter Array elements: ");
Scanner s=new Scanner(System.in);
for(i=0;i<2;i++)
{
 for(j=0;j<2;j++)
  {
   a[i][j]=s.nextInt();
  }
}
System.out.print("\n Matrix is: \n");
for(i=0;i<2;i++)
{
 for(j=0;j<2;j++)
  {
   System.out.print(a[i][j]+" ");
  }
System.out.println();
}
}
}

