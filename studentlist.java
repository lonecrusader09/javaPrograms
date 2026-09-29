import java.util.*;

class student
{
	Scanner sc = new Scanner(System.in);
	int roll;
	String name;
	String grade;

	student()
{
}
	student(String x, int y)
	{
		x = name;
		y = roll;
	}

	void accept()
	{
		System.out.println("Enter name of the student: ");
		name = sc.nextLine();
		System.out.println("Enter roll number: ");
		roll = sc.nextInt();
		System.out.println("Enter grade: ");
		grade = sc.next();
	}

	void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Roll No.: " + roll);
		System.out.println("Grade: " + grade);
	}
}

class studentlist
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		ArrayList<student> al = new ArrayList<student>();
		

		int n;

		System.out.print("Enter number of students: ");
		n = sc.nextInt(); 
		student s[] = new student[n];

		System.out.println("Enter student details:");
		for(int i = 0;i < n;i++)
		{
		s[i]=new student();
			s[i].accept();
			al.add(s[i]);
		}
		Iterator<student> itr = al.iterator();

		System.out.println("List of students: ");
		
			while(itr.hasNext())
			{
				student s1 = itr.next();
				s1.display();
			}
	
		int x;
		System.out.println("Enter the roll number to be deleted:");
		x = sc.nextInt();	
		for(int i = 0;i < n;i++)
		{
			if(s[i].roll == x)
			{
				al.remove(s[i]);
			}
		}

		itr = al.iterator();
		System.out.println("List of students: ");
		
			while(itr.hasNext())
			{
				student s1 = itr.next();
				s1.display();
			}

		System.out.print("Enter a roll number to update grade:");
		int y;
		y = sc.nextInt();
		itr = al.iterator();
		while(itr.hasNext())
		{
			student s1 = itr.next();
			if(s1.roll == y)
			{
				System.out.print("Enter updated grade:");
				String a = sc.next();
				s1.grade = a;	
			}
		}

		itr  = al.iterator();
		System.out.println("List of students: ");
		
			while(itr.hasNext())
			{
				student s1 = itr.next();
				s1.display();
			}


	}
}