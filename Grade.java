import java.util.Scanner;
public class Grade
{
    public static void main(String args[])
    {
        int mark[] = new int[5];
        int i;
        float sum=0, avg;
        Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter Marks Obtained in 5 Subjects : ");
        for(i=0; i<5; i++)
        {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }
		
        avg = sum/5;
		
        System.out.println("Your Grade is ");
        if(avg>75)
        {
            System.out.println("Distinction");
        }
        else if(avg>50 && avg<=75)
        {
            System.out.println("Merit");
        }
        else if(avg>40 && avg<=50)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.print("Fail");
        }
		System.out.println("Name= Harsh Sandhu");
		System.out.println("Roll no=65");
    }
}