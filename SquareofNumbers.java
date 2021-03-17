import java.util.*;
public class SquareofNumbers 
{
	public static void main(String[] args) 
	{
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        n=10;
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i]*a[i];
        }
        System.out.println("Sum:"+sum);
		System.out.println("Name= Harsh Sandhu");
		System.out.println("Roll no=65");
    }
}
