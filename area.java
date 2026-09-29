import java.util.*;

class Area_calc
{
	Scanner sc = new Scanner(System.in);

	double result;
	void circle()
	{
		System.out.println("Enter radius");
		int r = sc.nextInt();

		result = 3.14 * r * r;
		System.out.println("Area of circle:" + result);
	}

	void rectangle()
	{
		System.out.print("Enter length: ");
		double l = sc.nextDouble();
		System.out.print("Enter breadth");
		double b = sc.nextDouble();

		result = l*b;
		System.out.println("Area of rectangle: " + result);
	}
}

class area
{
	public static void main(String[] args)
	{	
		Area_calc a = new Area_calc();

		a.circle();
		a.rectangle();
	}
}