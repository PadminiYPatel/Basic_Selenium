package TestNg;

import org.testng.annotations.Test;

public class Priority_Invocation_Enabled {
	@Test(priority=1,invocationCount=2)
	public void demo1()
	{
		System.out.println("Demo1");
	}
	@Test(priority=3,invocationCount=1)
	public void demo2()
	{
		System.out.println("Demo2");
	}
	@Test(priority=2,invocationCount=1)
	public void demo3()
	{
		System.out.println("Demo3 ");
	}

}
