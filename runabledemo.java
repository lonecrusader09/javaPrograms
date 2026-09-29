class sample implements Runnable
{


	public void run()
	{
		for(int i = 1;i <= 5;i++)
		{
			System.out.println("i = " + i);
		}
	}
}

class runabledemo
{
	public static void main(String []args)
	{
		sample a = new sample();
		Thread t = new Thread(a);
		t.start();
	}
}


