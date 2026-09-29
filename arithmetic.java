/*class arithmetic
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + b;
		System.out.println("Addition =" + c);
		
		c = a - b;
		System.out.println("Subtraction =" + c);

		c = a * b;
		System.out.println("Multiplication =" + c);

		c = a/b;
		System.out.println("Dividsion =" + c);
	}
}
*/

class arithmetic
{
	public static void main(String[] args)
	{
		double l = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double result = l * b;
		System.out.println("Area  =" + result);

		double perimeter = 2*(l + b);
		System.out.println("Perimeter = " + perimeter);

		double r = Double.parseDouble(args[2]);
		result = 3.14 * r * r;
		System.out.println("Area =" + result);

		System.out.println("Addition = " + 7 + 5);
		System.out.println("Addition = " + (7 + 5));

		int h = Integer.parseInt(args[3]);
		b = Integer.parseInt(args[4]);
		result = 0.5 * b * h;
		System.out.println("Area = " + result);
	}
}