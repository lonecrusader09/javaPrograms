import java.util.*;

class armstrong
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of digits: ");
		int n = sc.nextInt();

 		int n1 = n;
		int sum = 0;

		while(n != 0)
		{
			int a = n % 10;
			sum  = sum + (a*a*a);
			n = n/10;
		}

		if(sum == n1)
			System.out.println("Armstring");
		else
			System.out.println("Not");

	}
}