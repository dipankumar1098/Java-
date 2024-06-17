import java.util.Scanner;

class ATM 
{
    private double bal = 10000;
    private int pwd;

    public void deposit(double money)
     {
        System.out.println("Enter password: ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 123) 
        {
            bal = bal + money;
            System.out.println("Deposited amount: " + money);
            System.out.println("Total balance: " + bal);
        }
        else 
        {
            System.out.println("Incorrect password!!!");
        }
    }

    public void withdraw(double money) 
    {
        System.out.println("Enter password: ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 123)
        {
            bal = bal - money;
            System.out.println("Withdrawal amount: " + money);
            System.out.println("Total balance: " + bal);
        } 
        else 
        {
            System.out.println("Incorrect password!!!");
        }
    }

    public void checkBalance() 
    {
        System.out.println("Enter password: ");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 123) {
            System.out.println("Account balance: " + bal);
        } else {
            System.out.println("Incorrect password!!!");
        }
    }
}

public class Customer
{
    public static void main(String[] args)
    {
        ATM b = new ATM();
        int ch;
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("\nEnter your choice: ");
        Scanner s2 = new Scanner(System.in);
        ch = s2.nextInt();
        switch (ch) 
        {
            case 1:
                b.deposit(1000);
                break;
            case 2:
                b.withdraw(1000);
                break;
            case 3:
                b.checkBalance();
                break;
            default:
                System.out.print("Invalid choice!");
        }
    }
}