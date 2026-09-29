import java.util.*;

class stringcodes
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		//int x = str.lastIndexOf(' ');
		/*String s1 = str.substring(x);
		s1 = s1 + ' ';
		s1 = s1 + str.substring(0,x);
		System.out.println(s1);	*/
		str=' '+str;
		int y = str.lastIndexOf(' ');

		String s2 = str.substring(y);
		String temp = "";
		for(int i = 0;i < y;i++)
		{
			
			if(str.charAt(i) == ' ')
			{
			
				temp =temp+ str.charAt(i+1) + '.';
			}
			
		}
		temp=temp+s2;
		System.out.println(temp);


		

	}
}