import java.util.*;

class A
{
	int area;

	void area()
	{
		int n = 10;
		area = 10*10;
	}
	void display()
	{
		System.out.println("Area of square: " + area);
	}
}

class B extends A
{
	int area;
	void area()
	{
		int l = 10,b = 20;
		area = l*b;
	}
	void display()
	{
		System.out.println("Area of rectangle: " + area);
	}
}

class overriding
{
	public static void main(String[] args)
	{
		B b = new B();
		b.area();
		b.display();
	}
}