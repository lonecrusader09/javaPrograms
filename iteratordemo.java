import java.util.*;

class iteratordemo
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("D");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("C");
		al.add("E");
		al.add("F");

		System.out.print("Elements of array list:");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			String element = itr.next();
			System.out.print(element + " ");
		}

		System.out.println();

		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext())
		{
			String element = litr.next();
			litr.set(element + "+");
		}

		System.out.print("Modified array list: ");
		itr = al.iterator();
		while(itr.hasNext())
		{
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		System.out.print("Backward list: ");
		while(litr.hasPrevious())
		{
			String element = litr.previous();
			System.out.print(element + " ");
		}
		

	}
}