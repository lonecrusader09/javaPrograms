//import shape.*;
//import house.bedroom;
//import house1.*;
//import house2.*;

import outer.bedroom;

class packdemo
{
	public static void main(String []a)
	{
		/*
		circle c = new circle();
		c.accept(14);
		c.area();

		rectangle r = new rectangle();
		r.accept(15,20);
		r.area();
		
		bedroom b = new bedroom();
		b.getlb(20,20);
		b.area();
		b.geth(10);
		b.volume();
		*/

		bedroom b = new bedroom();
		b.accept(20,20);
		b.area();
		b.geth(10);
		b.volume();
	}
}