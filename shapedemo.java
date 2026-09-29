import java.util.*;

interface drawable
{
	void draw();
}

interface resizable
{
	void resize(double factor);
}

class circle implements drawable,resizable
{
	int r = 10;
double area;
	public void draw()
	{
		area = 3.14*r*r;
		System.out.println("Area of shape: " + area);
	}

	public void resize(double f)
	{
		area = area * f;
	}

	void display()
	{
		System.out.println("resized shape: " + area);
	}
}

class rectangle implements drawable,resizable
{
	int l = 10;
	int b = 20;
	double area;
	public void draw()
	{
		area = l*b;
		System.out.println("Area of shape: " + area);
	}
	public void resize(double f)
	{
		area = area * f * f;
	}

	void display()
	{
		System.out.println("Resized shape: " + area);
	}
}

class shapedemo
{
	public static void main(String[] args)
	{
		circle c = new circle();
		rectangle r = new rectangle();

		c.draw();
		c.resize(2);
		c.display();

		r.draw();
		r.resize(5);
		r.display();

	}
}