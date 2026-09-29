import java.util.*;

//18
/*
class dectobinary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int n = sc.nextInt();
		int a;
		int arr[] = new int[20];
		int j = 0;
		while(n != 0)
		{
			a = n % 2;
			arr[j++] = a;
			
			n = n/2;
		}

		for(int k = j-1;k >=0;k--)
		{
			System.out.print( arr[k]);
		}
	}
}
*/

class dectobinary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
		int n = sc.nextInt();

		int pow = 0;
		double sum = 0;
		int a;
		while(n != 0)
		{
			a = n % 10;
			n = n/10;
			sum = sum + a * Math.pow(2,pow);
			pow++;
		}
		System.out.print("Decimal number: " + sum);
	}
}