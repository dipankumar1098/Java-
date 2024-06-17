import java.util.Scanner;

class Condition {

    public static void main(String args[])
    {
         int a;
         System.out.print("Enter age:");
         Scanner obj=new Scanner(System.in);
         a=obj.nextInt();
        if(a>18)
        {
            System.out.println("adult");
        } 
        else 
        {
            System.out.println("not adult");
        }
    }
}