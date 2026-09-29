import java.util.*;
class newArray
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows and columns:");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n][m];
	
		System.out.println("Enter elemts :");
		for(int i = 0;i < arr.length;i++)
		{
			for(int j = 0;j < m;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("2D array is :");
		for(int i = 0;i < n;i++)
		{
			System.out.println(" ");
			for(int j = 0;j < m;j++)
			{
				System.out.print(arr[i][j] + "    ");
			}
		}

		System.out.println(" ");

		int sum = 0;
		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < m;j++)
			{
				sum += arr[i][j];
			}
		}

		System.out.println("Sum of all elements: " + sum);

		
		for(int i = 0;i < n;i++)
		{
			sum = 0;
			for(int j = 0;j < m;j++)
			{
				sum += arr[i][j];
			}
			System.out.println("Sum of each row : " + sum);
		}

		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < m;j++)
			{
				if(i == j)
				{sum += arr[i][j];}
			}
		}
		System.out.print("Sum of digonal elements :" + sum);
		System.out.println(" ");

		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < n;j++)
			{
				if(i + j == n - 1)
				{
					sum += arr[i][j];
				}
			}
		}
		System.out.print("Sum of minor digonal :" + sum);
	}
}