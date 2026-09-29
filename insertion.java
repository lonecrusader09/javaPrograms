import java.util.*;

class insertion
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, i;

		System.out.println("Enter number of elements:");
		n = sc.nextInt();

		int a[] = new int[n];

		System.out.print("Enter array elements:");
		for(i = 0;i < n;i++)
		{
			a[i] = sc.nextInt();
		}


			int j, temp;
			for(i = 1;i < n;i++)
			{
				temp = a[i];

				for(j = i-1;a[j] > temp ;j--)
				{
					if(j==-1)
						break;
					a[j + 1] = a[j];
				}
			
		
		a[j+1] = temp;
}
		System.out.print("Sorted array is:");
		for(i = 0;i < n;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
}