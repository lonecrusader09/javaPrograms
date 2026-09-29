import java.util.*;

class reverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();

		String temp = "";
		for(int i = s.length()-1;i >= 0;i--)
		{
			temp = temp + s.charAt(i);
		}
		System .out.println("Reversed String: " + temp);

		if(s.equals(temp))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
		
	}
}