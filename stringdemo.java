import java.util.*;

class stringdemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		int n = str.length();

		for(int i = 0;i < n;i++)
		{
			System.out.println(str.charAt(i));
		}

		System.out.println(" ");

		for(int i = str.length()-1;i >= 0;i--)
		{
			System.out.println(str.charAt(i));
		}

		System.out.println("Lenght of the string: " + str.length());

		int count = 0;
		String temp = "";

		for(int i = 0;i < n;i++)
		{
			if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u')
			{
				count++;
				temp = temp + '*';
				
			}
			else if(str.charAt(i) == 'A' ||str.charAt(i) == 'E' ||str.charAt(i) == 'I' ||str.charAt(i) == 'O' ||str.charAt(i) == 'U')
			{
				count++;
				temp = temp + '*';
			}
			
			else
			{
				temp = temp + str.charAt(i);
			}

		}
		System.out.println("Number of vovels: " + count);

		int answer = str.length() - count;
		System.out.println("Number of consonents: " + answer);

		System.out.println("Replacing vovels by *: " + temp);		


		int c1=0,c2=0,c3=0,c4=0;
		for(int i = 0;i < n;i++)
		{
			char x = str.charAt(i);
			for(int j = 65;j <= 90;j++)
			{
				if(x == j)
				c1++;
			}

			for(int j = 97;j <= 122;j++)
			{
				if(x == j)
				c2++;
			}


			for(int j = 48;j <= 57;j++)
			{
				if(x == j)
				c3++;
			}

			for(int j = 0;j < 48;j++)
			{
				if(x == j)
				c4++;
			}

		}

		System.out.println("Number of capital alphabets: " + c1);
		System.out.println("Number of small alphabets: " + c2);

		System.out.println("Number of digits: " + c3);
		System.out.println("Number of symbols: " + c4);


		str = str + ' ';
		String temp1 = "";

		for(int i = 0;i < str.length();i++)
		{
			char x = str.charAt(i);
			if(x != ' ')
			{
				temp1 = temp1 + x;
			}
			else
			{
				System.out.println(temp1 + " " + temp1.length());
				temp1 = "";
			}
		}

		str = ' ' + str;
		String temp2 = "";

		for(int i = 0;i < str.length();i++)
		{
			char y = str.charAt(i);
			if(y != ' ')
			{
				temp2 = y + temp2;
			}
			else
			{
				System.out.println(temp2 = " " + temp2.length());
				temp2 = "";
			}
		}

	

		


		}
}