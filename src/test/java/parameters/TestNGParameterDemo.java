package parameters;
import org.testng.annotations.*;

public class TestNGParameterDemo {
	
	@Test
	@Parameters({"i", "j"})
	public void add(int a, int b)
	{
		System.out.println(a + b);
	}
	
	@Test
	@Parameters({"i", "j"})
	public void substraction(int a, int b)
	{
		System.out.println(a - b);
	}
	
	@Test
	@Parameters({"i", "j"})
	public void multiply(int a, int b)
	{
		System.out.println(a * b);
	}

}
