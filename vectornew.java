import java.util.*;

class vectornew
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of the vector:");
		int n = sc.nextInt();

		Vector<Integer> v = new Vector<Integer>(n);
		
		int x;
		System.out.println("Enter elements");
		for(int i = 0;i < v.capacity();i++)
		{
			x = sc.nextInt();
			v.addElement(x);
		}

		System.out.println(v);

		int a[] = new int[10];
		v.copyInto();
		for(int i = 0;i < v.capacity();i++)
		{
			System.out.println(a[i] + " ");
		}

	}
}
