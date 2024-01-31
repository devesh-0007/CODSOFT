import java.util.*;
import java.util.Random;
class numbergame
{
    public static void main()
    {
        String condi="yes";
        while(condi.equalsIgnoreCase("yes"))
        {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO NUMBER GAME");
        System.out.println("enter your number.");
        int num;
        num=sc.nextInt();
        sc.nextLine();
        Random rand=new Random();
        int ran=rand.nextInt(100);
        if(num==ran)
        {
            System.out.println("you entered currect number");
            
        }
        else if(num>ran)
        {
            System.out.println("the entered number is larger.");
            
        }else
        {
            System.out.println("The entered number is smaller.");
        }
        System.out.println("Type 'YES' to continue and 'NO'");
        condi=sc.nextLine();
        if(condi.equalsIgnoreCase("no"))
        {
            System.out.println("Thank you");
        }
        }
        }
    }
