import java.util.*;
class gradecalculator
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        String condition="yes";
        while(condition.equalsIgnoreCase("yes"))
        {
            System.out.println("enter num of subjects");
            int n=sc.nextInt();
            sc.nextLine();
            int sum=0,avg=0;
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("enter marks of subjects out of 100");
                ar[i]=sc.nextInt();
                sc.nextLine();
                sum=sum+ar[i];
            }
            System.out.println("You scored a total of "+sum+" marks in "+n+" subjects");
            avg=sum/n;
            System.out.println("your percentage is-> "+avg+"%");
            if(avg>80)
            {
                System.out.println("your grade is 'A'");
            }
            else if( avg>60&&avg<=80)
            {
                System.out.println("Your grade is 'B'");
            }
            else if( avg>50&&avg<=60)
            {
                System.out.println("Your grade is 'C'");
            }
            else if( avg>33&&avg<=50)
            {
                System.out.println("Your grade is 'D'");
            }
            else
            {
                System.out.println("your failed the examinations.");
            
            }
            System.out.println("enter 'YES' to continue and 'NO' to exit.");
            condition=sc.nextLine();
        }
    }
}