import school.marks.grades;

class packdemo1
{
	public static void main(String []args)
	{
		grades g = new grades();
		g.accept("Aditya",1);
		g.getmarks(40,50,60);
		g.average();
		g.print();
	}
}