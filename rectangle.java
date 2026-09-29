package shape;

public class rectangle
{
	int l, b;

	double a;

	public void accept(int x, int y)
	{
		l = x;
		b = y;
	}

	public void area()
	{
		a = l * b;
		System.out.println("Area of rectangle:" + a);
	}
}