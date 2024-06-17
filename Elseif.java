import java.util.Scanner;
class Elseif
{
 public static void main(String[]args)
  {
   int marks;
   System.out.print("Enter marks: ");
   Scanner obj=new Scanner(System.in);
   marks=obj.nextInt();
   if(marks>=60)
    {
    System.out.print("1st Division");
    }
   else if(marks>=45 && marks<60)
    {
    System.out.print("2nd Division");
    }
    else if(marks>=33 && marks<45)
    {
    System.out.print("3rd Division");
    }
else
   {
    System.out.print("fail");
   }
  }
}