import java.util.*;

class circle_area
{

Scanner sc = new Scanner(System.in);
int r;
	void getr()
	{
		System.out.print("Enter radius of circle:");
		r = sc.nextInt();
	}

	void area()
	{
		double area = 3.14 * r * r;
		System.out.println("Area of circle : " + area);
	}
}

class circle
{
	public static void main(String[] args)
	{
		circle_area c = new circle_area();
		c.getr();
		c.area();
	}
}