import java.util.*;

abstract class shape
{
	abstract void area();
	abstract void perimeter();
	abstract void circumference();
	abstract void display();
}

class circle extends shape
{
	Scanner sc = new Scanner(System.in);
	int r;
	double area;
	double c;
	circle()
	{
	System.out.println("Enter radius: ");
	r = sc.nextInt();
	}

	void area()
	{
		area = 3.14*r*r;
	}

	void circumference()
	{
		c = 2*3.14*r;
	}	

	void perimeter()
	{}

	void display()
	{
		System.out.println("Area of circle: " + area);
		System.out.println("Circumference of circle: " + c);
	}
}

class square extends shape
{
	Scanner sc = new Scanner(System.in);
	float area;
	int p;
	int s;
	square()
	{
		System.out.println("Enter side of square: ");
		s = sc.nextInt();
	}

	void area()
	{
		area = s*s;
	}
	void perimeter()
	{
		p = 4*s;
	}
	void circumference(){}

	void display()
	{
		System.out.println("Area of square: " + area);
		System.out.println("Perimeter of square: " + p);
	}
}	

class abstractdemo
{
	public static void main(String[] args)
	{
		shape s = new circle();
		shape s1 = new square();

		s.area();
		s.circumference();
		s.display();

		s1.area();
		s1.perimeter();
		s1.display();
	}
}