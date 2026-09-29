class box
{
	int l,b,h,v;	

	box()
	{
		l = b = h = 20;
		v= 0;
	}

	box(int x)
	{
		l = b = h = x;
		v = 0;
	}

	box(int x,int y)
	{
		l = b = x;
		h = y;
		v = 0;
	}

	box(int x, int y, int z)
	{
		l = x;
		b = y;
		h = z;
		v = 0;
	}

	box(box obj)
	{
		l = obj.l;
		b = obj.b;
		h = obj.h;
		v = 0;
	}

	void volume()
	{
		v = l * b * h;
		System.out.println("Volume :" + v);
	}
}

class boxdemo
{
	public static void main(String[] args)
	{
		box b = new box();
		b.volume();
		box b1 = new box(15);
		b1.volume();
		box b2 = new box(10,20);
		b2.volume();
		box b3 = new box(10,20,30);
		b3.volume();
		box b4 = new box(b2);
		b4.volume();
	}
}