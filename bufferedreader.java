import java.io.*;

class bufferedreader
{
	public static void main(String[] args)throws IOException
	{
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(I);
		
		System.out.print("Enter a string to check for anagaram: ");
		String s1 = br.readLine();
		System.out.print("Enter another string: ");
		String s2 = br.readLine();
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		int arr[] = new int[26];


		for(int j = 0;j < s1.length();j++)
		{
			int a = (int)s1.charAt(j) -65;
			arr[a] += 1;
		}


		for(int k = 0;k < s2.length();k++)
		{
			int b = s2.charAt(k) - 'A';
			arr[b] -= 1;
		}
		
		int flag = 0;
		for(int i = 0;i < 26;i++)
		{
			if(arr[i] != 0)
			{
				flag = 1;
				break;
			}
			
		}
	if(flag==0)
	System.out.println("Anagram");
	else
	System.out.println("Not");


	}
}