import java.util.Scanner;
class Ifelse
{
 public static void main(String args[])
  {
   int pass;
   System.out.print("Enter password: ");
   Scanner obj=new Scanner(System.in);
   pass=obj.nextInt();
   if(pass==000)
    {
     System.out.println("Myself Deepan");
     System.out.println("IG: i_amdeepan");
     System.out.println("Student of Engineering");
     System.out.println("Bhubaneswar");
    }
   else
    { 
     System.out.print("Sorry!Wrong Password...");
    }
  }
}