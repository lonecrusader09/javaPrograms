import java.util.*;
class student
{
	int roll, m1, m2, m3;
	String name;
	double avg;
	char grade;
	int total_marks = 300;	

	Scanner sc = new Scanner(System.in);
	void accept()
	{
		System.out.print("Enter roll number of student :");
		roll = sc.nextInt();

		System.out.print("Enter name of the student :");
		name = sc.next();

		System.out.print("Enter marks in 3 subjects :");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		System.out.println("_____________________________________________");

	}

	void calc()
	{
		avg = (m1 + m2 + m3)/3.0;

		if(avg >= 90)
		{
			grade = 'A';
		}
		else if(avg >= 80 && avg < 90)
		{
			grade = 'B';
		}
		else if (avg >= 70 && avg < 80)
		{
			grade = 'C';
		}
		else if(avg >=40 && avg < 70)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}
	}

	static void topper(student s[])
	{
		double max = s[0].avg;
		int j = 0;

		for(int i = 0;i < s.length;i++)
		{
			if(s[i].avg > max)
			{
				max = s[i].avg;
				j = i;
			}
		}

		System.out.println("Topper is :" + s[j].name);
	}

	static void sort_by_marks(student s[])
	{
		student temp;
		for(int i = 1;i < s.length;i++)
		{
			for(int j = 0;j < s.length - i;j++)
			{
				if(s[j].avg > s[j+1].avg)
				{
					temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
	}

	static void sort_by_roll(student s[])
	{
		student temp;
		for(int i = 1;i < s.length;i++)
		{
			for(int j = 0;j < s.length - i;j++)
			{
				if(s[j].roll > s[j+1].roll)
				{
					temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;	
				}
			}
		}
	}

	static void sort_by_name(student s[])
	{
		student temp;
		for(int i = 1;i < s.length;i++)
		{
			for(int j = 0;j < s.length - i;j++)
			{
				if(s[j].name.compareTo(s[j+1].name) > 0)
				{
					temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
	}

	void display()
	{
		System.out.println("_____________________________________________");
		System.out.println("Name                :" + name);
		System.out.println("Roll no.            :" + roll);
		System.out.println("Marks in 3 subjects :" + m1 + " " + m2 + " " + m3);
		System.out.println("Average percentage  :" + avg + "%");
		System.out.println("Grade               :" + grade);
		System.out.println("_____________________________________________");

	}

	public String toString()
	{
		return name + "\t" + roll + "\t" + avg + "\t" + grade;
	}
}


class studentdemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students :");
		int n = sc.nextInt();
		
		student s[] = new student[n];

		for(int i = 0;i < n;i++)
		{
			s[i] = new student();
		}
		
		for(int i = 0;i < n;i++)
		{
			s[i].accept();
			s[i].calc();
		}
		
		for(int i = 0;i < s.length;i++)
		{
			System.out.println(s[i]);
		}

		int ch;
		String t;
do
{
		System.out.println("1.Display records");
		System.out.println("2.Display topper name");
		System.out.println("3.Sort by Marks");
		System.out.println("4.Sort by Roll number");
		System.out.println("5.Sort by Name");
		System.out.println("6.Exit");

		System.out.print("Enter your choice :");
		ch = sc.nextInt();


		switch(ch)
		{
			case 1:
				for(int i = 0;i < n;i++)
				{
				s[i].display();
				}
				break;

			case 2:
				student.topper(s);
				break;
				
			case 3:
				student.sort_by_marks(s);
				for(int i = 0;i < s.length;i++)
				{
					s[i].display();
				}
				break;

			case 4:
				student.sort_by_roll(s);
				for(int i = 0;i < s.length;i++)
				{
					s[i].display();
				}
				break;

			case 5:
				student.sort_by_name(s);
				for(int i = 0;i < s.length;i++)
				{
					s[i].display();
				}
				break;

			case 6:
				System.exit(0);
				
				
				
		}

		
}while(ch<=5);
		

		

		
		/*
		student s = new student();
		s.accept();
		s.calc();
		s.display();
		*/
	}
}
