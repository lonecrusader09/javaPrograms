import java.util.*;

class room
{
	int l,b;
	int area;
	room(int x,int y)
	{
		l = x;
		b = y;
	}
	void area()
	{
		area  = l*b;
		System.out.println("Area" + area);
	}
}

class bedroom extends room
{
	int h;
	int volume;
	bedroom(int x, int y, int z)
	{
		super(x,y);
		h = z;
	}
	void volume()
	{
		volume = l*b*h;
		System.out.println("Volume: " + volume);
	}
}

class superdemo
{
	public static void main(String[] args)
	{
		room r = new bedroom(11,12,13);
		bedroom br = new bedroom(11,12,13);
		r.area();
		br.volume();
	}
}