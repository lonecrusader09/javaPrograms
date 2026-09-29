import java.util.*;

//25

class nievennumber
{
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int a;
		int sum = 0;
		int n1 = n;
		while(n != 0)
		{
			a = n % 10;
			n = n/10;
			sum += a;
		}
		System.out.println(sum);
		if(n1 % sum == 0)
		{
			System.out.println("Nieven number");
		}
	}
}