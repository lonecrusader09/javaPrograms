/*
class loops
{
	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		
		if(n % 2 == 0)
		{
			System.out.println("Even Number");
		}
		
		else
		{
			System.out.println("Odd Number");
		}
	}
}
*/


/*
import java.util.*;

class prime
{
	boolean isPrime(int n)
	{
		if (n < 0)
			return false;

		for(int i = 2; i <= n/2; i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}
}

class loops
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		prime p = new prime();
		

		if(p.isPrime(n))
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}

	}
}

*/



import java.util.*;

class loops 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter your age :");
		int a = sc.nextInt();
		
		String res = (a > 18) ? ("Adult") : ("Not Adult");
		System.out.println(res);

	}
}