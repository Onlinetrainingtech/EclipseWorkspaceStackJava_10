
public class Sample 
{

	void get1()
	{
		try
		{
		int a=100/0;
		
		System.out.println("Your data is::"+a);
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check your Application");
		}
		get2();
	}
	void get2()
	{
		try
		{
		String name="welcome";
		System.out.println("Normal Method is"+name.length());
		}
		catch(NullPointerException y) {
			System.out.println("Please check the String.."+y);
		}
		finally
		{
			System.out.println("this is finally block");
		}
	}
	
	
	
	public static void main(String[] args)
	{
		
		Sample d1=new Sample();
		d1.get1();

	}

}
