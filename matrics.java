import java.util.*;
class matrics
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows and columns:");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n][m];

		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < m;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("2D array is :");
		for(int i = 0;i < n;i++)
		{
			for(int j = 0;j < m;j++)
			{
				System.out.print(arr[i] + " ");
			}
		}
	}
}