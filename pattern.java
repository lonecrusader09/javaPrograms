import java.util.*;

//1
/*
class pattern
{
	public static void main(String[] args)
	{
		for(int i = 1;i < 13;i=i+2)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i = 11;i >= 1;i=i-2)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
*/

//2
/*
class pattern
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		for(int i = 0;i < n;i++)
		{
			System.out.println("Hello World");
		}
	}
}
*/

//3

/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		

		for(int i = 1;i <= 10;i++)
		{
			System.out.print(i + " ");
		}

	System.out.println();

		for(int i = 1;i <= 20;i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i + " ");
			}
		}

	System.out.println();

		for(int i = 1;i <= 20;i++)
		{
			if(i % 2 == 1)
			{
				System.out.print(i + " ");
			}
		}
	System.out.println();
		
		int n;
		int sum = 0;
		System.out.print("Enter a number: ");
		n = sc.nextInt();

		for(int i = 1;i <= n;i++)
		{
			sum += i;
		}
		System.out.print("Sum of n numbers: " + sum);

		System.out.println();		

		int product = 1;
		for(int i = 1;i <= n;i++)
		{
			product	= product * i;
		}
		System.out.print("Product of n numbers: " + product);

		System.out.println();

	

		int x,y;
		System.out.print("Enter two numbers: ");
		x = sc.nextInt();
		y = sc.nextInt();

		int s = 0;
		int p = 1;
		for(int i = x + 1;i < y;i++)
		{
			s += i;
			p = p * i;
		}
	
		System.out.println("Sum of numbers between given 2 numbers: " + s);
		System.out.println("Product of numbers between given 2 numbers: " + p);


	}
}
*/


/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.print("Enter two numbers: ");
		n = sc.nextInt();
		m = sc.nextInt();
		int c;
		c = n;
		for(int i = 0;i < m;i++)
		{
			c++;
		}
		System.out.print("Sum: " + c);

	System.out.println();

		int product;
		product = 0;
		for(int i = 0;i < m;i++)
		{
			product += n;
		}
		System.out.println("Product: " + product);
		
	}
}
*/

//12
/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number: ");
		n = sc.nextInt();
	int flag  = 0;
		for(int i = 2;i <=n;i++)
		{
			for(int j = 2;j <= i/2;j++)
			{
				if(i % j == 0)
				{
					flag = 1;
					break;
				}
			}
	
			if(flag == 0)
			{
				System.out.print(i + " ");
			}
			flag = 0;
		}	
	}
}
*/

//13
/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a numebr: ");
		n = sc.nextInt();

		int factorial = 1;
		for(int i = 1;i <= n;i++)
		{
			factorial = factorial * i;
		}
		System.out.println("Factorial of n: " + factorial);
	}
}
*/

//14
/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number: ");
		n = sc.nextInt();

		for(int i = 1;i <= n;i++)
		{
			if(n % i == 0)
			{
				System.out.print(i + " ");
			}
		}
	}
}
*/

//19
/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int a;
		int sum = 0;
		while(n > 0)
		{
			a = n % 10;
			sum += a;

			n = n / 10;
		}
		System.out.println("Sum of digits: " + sum);
	}
}
*/

//15
/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int a;
		int x;
		int n1 = 0;
		for(int i = 0;i <= 9;i++)
		{
		x = n;
		while(x != 0)
		{
			a = x % 10;
			x = x/10;
			if(a == i)
			{
				n1 = n1 * 10 + a;
			}
			

		}
		}
		System.out.println("Digits in ascending order: " + n1);

	}
}
*/

//16
/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int a;
		int x;
		int n1 = 0;
		for(int i = 9;i >= 0;i--)
		{
		x = n;
		while(x > 0)
		{
			a = x % 10;
			x = x/10;
			if(a == i)
			{
				n1 = n1 * 10 + a;
			}
			

		}
		}
		System.out.println("Digits in descending order: " + n1);

	}
}
*/

//18
/*
class pattern
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

//20
/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int prod = 1;
		int a;

		while(n != 0)
		{
			a = n % 10;

			prod = prod * a;
			n = n/10;
		}
		System.out.println("Product of digitd: " + prod);
	}
}
*/

//26
/*
class pattern
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = sc.nextInt();

		int a;
		int n1 = 0;
		int x = n;

		while(n != 0)
		{
			a = n % 10;
			n = n/10;
			n1 = (n1*10)+a;
			System.out.print(n1 + " ");
		}		

		if(n1 == x)
		{
			System.out.print("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
8?


//24
/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int prod = 1;
		int a;

		while(n != 0)
		{
			a = n % 10;
			n = n/10;

			sum = sum + a;
			prod = prod * a;
		}
		if(sum == prod)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not");
		}

	}
}
*/

//25
/*
class pattern
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
		if(n % sum == 0)
		{
			System.out.println("Nieven number");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
*/

//23
/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[50];
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int j = 0;
		int x = n;
		for(int i = 1;i < n;i++)
		{
			if(n % i == 0)
				arr[j++] = i;
			
		}

		int sum = 0;

		for(int k = 0;k < j;k++)
		{
			sum = sum + arr[k];
		}

		if(sum == x)
		{
			System.out.println("n is a perferct number");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
*/

//21
/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal amount rate of interesr and time(years):");
		int p = sc.nextInt();
		double r = sc.nextDouble();
		int t = sc.nextInt();

		double si;

		si = (p * r * t)/100;

		System.out.println("Simple Interest" + si);
	}
}
*/

//27
/*
class pattern
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int x = n;
		int a;
		int sum = 0;

		while(n != 0)
		{
			a = n % 10;
			n = n/10;

			sum += (a*a*a);
		}
		if(sum == x)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
*/

//44-17
/*
class pattern
{
	public static void main(String[] args)
	{

		for(int i = 1;i <= 7;i++)
		{
			for(int j = 7;j > 7-i;j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}
*/

//44-16
/*
class pattern
{
	public static void main(String[] args)
	{
		for(int i = 1;i <= 5;i++)
		{
			for(int j = 1;j <= i;j++)
			{
				System.out.print(j + " ");
				
			}
		for(int j=5-i;j>0;j--)
		{
		System.out.print(i+" ");
		}
			System.out.println();
		}
			}
} 
*/

//28
/*
class pattern
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Enter a number:");
		n = sc.nextInt();

		int a = 0;
		int b = 0;

		int n1;
		while(n != 0)
		{
			n1 = n % 10;
			
			if(n1 % 2 == 0)
				{ a += n1;}
			else
				{b += n1;}
			
			n = n/10;
		}

		if(a == b)
		{
			System.out.println("Lead number");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
*/

//29

/*
class pattern
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number: ");
		n = sc.nextInt();

		int sum = 0;
		while(n != 0)
		{
			n = n % 10;
			sum = sum + n;

	
			n = n/10;
		}

		if (n % sum == 0)
		{
			System.out.println("Harshad number");	
		}
		else
		{
			System.out.println("Not");
		}
	}
}
*/

//30
/*
class pattern
{
	public static void main(String [] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		n = sc.nextInt();
		int n1 = n;
		int sum = 0;
		int x=n;
		int prod = 1;
		while(n != 0)
		{
			n1 = n % 10;
		
			for(int i = n1;i > 0;i--)
			{
				prod = prod * i;
			

			}
			sum += prod;
			
			prod = 1;
			
			n = n/10;
		}
			

		if(x == sum)
		{
			System.out.println("Krishnamurthy number");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
*/

//31
/*
class pattern
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number: ");
		n = sc.nextInt();

		int rev = 0;
		int n1 = n;
		int flag1 = 0;
		int flag2 = 0;

		while(n != 0)
		{
			n1 = n % 10;

			rev  = (rev * 10) + n1;
			n = n/10;
		}
		System.out.println("Reverse number: " + rev);

		for(int i = 2;i <= n/2;i++)
		{
			if(n % i == 0)
			{
				flag1 = 1;
			}
			else
			{flag1 = 0;}
		}

		for(int i = 2;i <= rev/2;i++)
		{
			if(rev % i == 0)
			{
				flag2 = 1;
			}
			else
			{
				flag2 = 0;
			}
		}

		if(flag1 == 0 && flag2 == 0)
		{
			System.out.println("Twisted prime number");
		}
		else
		{System.out.println("Not");}
	}
}
*/

//32
/*
class pattern
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int n,m;
		n = sc.nextInt();
		m = sc.nextInt();
		int x,y,r;

		if(n > m)
		{
			x = n;
			y = m;
		}
		else
		{
			x = m;
			y = n;
		}	

		while(true)
		{
			r = x % y;
			if(r == 0)
				break;

			x = y;
			y = r;
		}

		System.out.println("GCD = " + y);
	
		if(y == 1)
		{
			System.out.println("co prime numbers");
		}
		else
		{
			System.out.println("not co prime");
			}
	}
}
*/



/*
A
AB
ABC
ABCD
ABCDE
*/

/*
class pattern
{
	public static void main(String [] args)
	{

		for(int i = 0;i <= 5;i++)
		{
			for(char j = 65;j < 65+i;j++)
			{
				System.out.print(j + "");
			}
			System.out.println("");
		}
	}
}
*/



//33: Next Prime number 
/*
class pattern
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		int flag = 0;
		int i;

		while(true)
		{
			for(i = 2;i <= n/2;i++)
			{
				if(n % i == 0)
				{
					flag = 1;
					break;
				}
			}
			
		
		if(flag == 1)
			n++;
		else
			{
			System.out.println("Prime is: " + n);
			break;
			}
		flag =0;
}
		
	}
}

*/

//34: Previous prime number

/*
class pattern
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter a number: ");
		n = sc.nextInt();

		int flag = 0;
		for(int i = 2;i <= n/2;i++)
		{
			if(n % i == 0)
			{
				flag = 1;
				break;
			}
			flag = 0;
		}
		if(flag == 0)
			System.out.println("Prime number");
		else
			System.out.println("Not prime");


		while(true)
		{
			n--;
			for(int i = 2;i < n/2;i++)
			{
				if(n % i == 0)
				{
					flag = 1;
					break;
				}
			}

			if(flag == 0)
			{
				System.out.println("Previous prime is:" + n);
				break;
			}
		flag = 0;
		}
	}
}

*/

/*
    A
   A B
  A B C
 A B C D
A B C D E
*/

/*
class pattern
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i <= 5;i++)
		{

			for(int k = i;k <5;k++)
				System.out.print(" ");
			for(char j = 65;j < 65+i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}
}

*/

//35

/*
class pattern
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int flag1 = 0, flag2 = 0;

		
		System.out.println("Enter a number: ");
		n = sc.nextInt();
	
		int n1 = n;

		for(int i = 2;i < n/2;i++)
		{
			if(n % i == 0)
			{
				flag1 = 1;
				break;
			}
			flag1 = 0;	
		}

		if(flag1 == 0)
			System.out.println("Prime");
		else
			System.out.println("Not");

		int rev = 0;
		while(n > 0)
		{
			n1 = n % 10;
			rev  = (rev * 10) + n1; 
			n = n/10;
			
		}
		
		System.out.println("Reverse: "+ rev);
			if(rev != n)
			{
				flag2 = 1;
			}
			flag2 = 0;


		if(flag1 == 0 && flag2 == 0)
			System.out.println("Number is prime and palindrome:");
		else if(flag1 == 0 && flag2 == 1)
			System.out.println("Prime but not palindrome");
		else if(flag1 == 1 && flag2 == 0)
			System.out.println("Not prime but palindrome");
		else
			System.out.println("Not prime not palindrome");
	}
}
*/

/*
7777777777777
7666666666667
7655555555567
7654444444567
7654333334567
7654322234567
7654321234567
7654322234567
7654333334567
7654444444567
7655555555567
7666666666667
7777777777777
*/

/*
class pattern
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int i,j;

		for(i = 7;i >= 1;i--)
		{
			for(j = 7;j >= i;j--)
				System.out.print(j);
			for(j = 1;j < 2*i-2;j++)
				System.out.print(i);
			for(j = i;j <= 7;j++)
			{
				if(j != 1)
					System.out.print(j);
			}
			System.out.println();
		}

		for(i = 1;i <= 6;i++)
		{
			for(j = 7;j > i;j--)
				System.out.print(j);
			for(j = 1;j < i*2;j++)
				System.out.print(i+1);
			for(j = i + 1;j <= 7;j++)
				System.out.print(j);
			System.out.println();
		}	
	}
}
*/


//36: Automorphic number

class pattern
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();

		int x = n * n;
		
		x = x % 10;

		if(x == n)
			System.out.println("Automorphic number");
		else
			System.out.println("Not automorphic number");
	}
}
