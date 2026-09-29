import java.util.*;

class room
{
	int l,b;
	double area;
	void accept(int x,int y)
	{
		l = x;
		b = y;
	}
	void area()
	{
		area = l*b;
		System.out.println("Area: " + area);
	}
}

class bedroom extends room
{
	int h;
	double volume;
	void geth(int x)
	{
		h = x;
	}
	void volume()
	{
		volume = l*b*h;
		System.out.println("Volume: " + volume);
	}
}

class inheritancedemo
{
	public static void main(String[] args)
	{
		bedroom br = new bedroom();
		br.accept(15,15);
		br.area();
		br.geth(10);
		br.volume();	
	}
}