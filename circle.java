package shape;

public class circle
{
	int r;
	double a;

	public void accept(int x)
	{
		r = x;
	}
	
	public void area()
	{
		a = 3.14 * r * r;
		System.out.println("Area of circle:" + a);
	}
}

