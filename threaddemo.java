class A extends Thread
{
	public void run()
	{
		for(int i = 1;i <= 5;i++)
		{
			System.out.println("i = " + i);
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int j = 1;j <= 5;j++)
		{

			try
			{
				if(j == 3)
					wait(1000);
			}	
			catch(Exception e)
			{
				System.out.println("Handling interrupts");
			}
		

			System.out.println("j = " + j);
		}
	}
}

class C extends Thread
{
	public void run()
	{
		for(int k = 1;k<= 5;k++)
		{
			try
			{
				if(k == 3)
				sleep(1000);
			}	
			catch(Exception e)
			{
				System.out.println("Handling interrupts");
			}
		
			System.out.println("k = " + k);
		}
	}
}

class threaddemo
{
	public static void main(String [] args)
	{
		System.out.println("Entered in main");
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();

		obj1.setPriority(1);
		obj2.setPriority(5);
		obj3.setPriority(10);
		obj1.setName("ONE");
		System.out.println(obj1);
		obj1.start();
		obj2.start();
		obj3.start();

		try{
		obj1.join();
		obj2.join();
		obj3.join();
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		System.out.println(obj3.getPriority());

		System.out.println("Exited from main");
	}
}