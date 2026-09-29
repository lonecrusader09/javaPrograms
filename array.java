import java.util.*;

class bubble_sort
{
	void input(int n,int arr[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements:");
		for(int i = 0;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
	}

	void sort(int arr[])
	{
		int temp;
		for(int i = 1;i < arr.length;i++)
		{
			for(int j = 0;j < arr.length-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	void selection_sort(int arr[])
	{
		int i,temp;
		int k = 0;
		for(i = 0;i < arr.length - 1;i++)
		{
			 k = i;
			for(int j = i + 1;j < arr.length;j++)
			{
				if(arr[j] < arr[k])
				{
					k = j;
				}
			}
		
		if(k != i)
		{
			temp = arr[k];
			arr[k] = arr[i];
			arr[i] = temp;
		}
		}
	}

	

	void print(int arr[])
	{
		System.out.println("Sorted array elements are :");
		for(int i = 0;i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}

class array
{
	public static void main(String[] args)
	{
		bubble_sort b = new bubble_sort();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements :");
		int n = sc.nextInt();
		int[] arr = new int[n];
			
		b.input(n,arr);
		//b.sort(arr);
		//b.print(arr);
		b.selection_sort(arr);
		b.print(arr);
	}
}