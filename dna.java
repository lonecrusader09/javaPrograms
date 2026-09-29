import java.util.*;

class dna
{
	public static void main(String[] args)
	{
		String dna = "AGGAATGTTCCCAATAGTAGACATAAAAGTC";
		String temp = "";

		int n = dna.indexOf("ATG");
		if(n != -1)
		{
			System.out.println("Index of ATG: " + n);
		}

		int m;
		if(n != -1)
		{
			m = dna.indexOf("TAA",n);
		}
		else
		{
			m = dna.indexOf("TAA");
		}

		if(m != -1)
		{
			System.out.println("Index position of TAA: " + m);
		}

		String s1 = "";
		if(n != -1 && m != -1)
		{
			s1 = dna.substring(n,m);
			System.out.println("Substring between ATG and TAA: " + s1);
			
		}
		
		int a = s1.length();
		if(a % 3 == 0)
		{
			System.out.println("String with length divisible by 3" + s1);
			System.out.println("ATG" + s1 + "TAA");
		}
		else
		{
			System.out.println("No substring");
		}
	}

}