import java.util.*;
class atm           
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter pin.");
        atm ob=new atm();
        int input=0,amt=10000;
        int pin=sc.nextInt();
        String s="y";
        while(s.equalsIgnoreCase("y"))
        {
            if(pin==1234)
            {
                System.out.println("Welcome to Your Automatic Transmission Machine");
                System.out.println("Select an option to continue");
                System.out.println("1.> Checkbalance");
                System.out.println("2.> withdraw");
                System.out.println("3.> deposit");
                System.out.println("4.> Exit");
                input=sc.nextInt();
                sc.nextLine();
                if(input==1)
                {
                    int a=ob.checkbalance(amt);
                    sc.nextLine();
                    System.out.println("your balance is...>"+a);
                    //ob.checkbalance();
                }
                else if(input==2)
                {
                    int b=ob.withdraw(amt);
                    sc.nextLine();
                    System.out.println("Your Left Balance Is...>"+b);
                    //ob.withdraw();
                }
                else if(input==3)
                {
                    int c=ob.deposit(amt);
                    sc.nextLine();
                    System.out.println("Your balance after deposition is...>"+c);
                    //ob.deposit();
                }
                else if(input==4)
                {
                    System.out.println("Thank You");
                    System.exit(0);
                    //-ob.exit();
                }
                else 
                {
                    System.out.println("enter a valid number");
                }
            }
            else
            {
                System.out.println("invalid pin.Please enter valid pin");
            }
            System.out.println("enter 'Y' to continue and 'N' to discontinue");
            s=sc.nextLine();
        }
    }
        int checkbalance(int x)
        {
             int amt1=x;
             return amt1;
        }
        int withdraw(int y)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter amount to be withdrawn.");
            int with=sc.nextInt();
            sc.nextLine();
            int amt2=y-with;
            return amt2;
        }
        int deposit(int z)
        {
               Scanner sc=new Scanner(System.in);
            System.out.println("enter amount to be deposited.");
            int depo=sc.nextInt();
            sc.nextLine();
            int amt3=z+depo;
            return amt3;
        }
    }