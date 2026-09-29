import java.util.*;

class studentinfo
{
	Scanner sc = new Scanner(System.in);
	String name;
	int roll;
	void accept()
	{
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter roll number: ");
		roll = sc.nextInt();
	}
}

class marks extends studentinfo
{
	Scanner sc = new Scanner(System.in);
	int m1,m2,m3;
	void getmarks()
	{
		System.out.print("Enter marks in 3 subjects: ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
	}
}

class result extends marks
{
	double percentage;
	void calc()
	{
		percentage = (m1 + m2 + m3)/3;
	}

	void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Roll number: " + roll);
		System.out.println("Marks in 3 subjects: " + m1 + " " + m2 + " " + m3);
		System.out.println("Average percentage: " + percentage);
		System.out.print("Grade: ");
		if(percentage >=85)
		{
			System.out.print("A");
		}
		if(percentage >= 75 && percentage <= 85)
		{
			System.out.print("B");
		}
		if(percentage >= 60 && percentage <= 75)
		{
			System.out.print("C");
		}
		if(percentage >= 40 && percentage <= 60)
		{
			System.out.print("D");
		}
		if(percentage < 40)
		{
			System.out.print("F");
		}


	}
}

class studentmain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Enter number of students: ");
		n = sc.nextInt();
		
		result r[] = new result[n];

		for(int i = 0;i < n;i++)
		{
			r[i] = new result();
		}

		for(int i = 0;i < n;i++)
		{
			r[i].accept();
			r[i].getmarks();
			r[i].calc();
		}

		for(int i = 0;i < n;i++)
		{
			r[i].display();
			System.out.println(" ");
		}
		/*result r = new result();
		r.accept();
		r.getmarks();
		r.calc();
		r.display();*/
	}
}