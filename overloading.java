class shape 
{
	double a;
	void area(int r)
	{
		a = 3.14 * r * r;
		System.out.print("Area of circle :" + a);
		System.out.println(" ");

	}

	void area(int l, int b)
	{
		a = l * b;
		System.out.print("Area of rectangle :" + a);
		System.out.println(" ");
	}
	
	void area(double b, double h)
	{
		a = 0.5 * b * h;
		System.out.print("Area of triangle :" + a);
		System.out.println(" ");

	}
}

class overloading
{
	public static void main(String[] args)
	{
		shape s = new shape();
		s.area(5);
		s.area(5,5);
		s.area(1.5,3.5);
	}

}