class B1
{
	int a=100;
	void get1()
	{
		System.out.println("BaseClass::"+a);
	}
}
class D1 extends B1
{
	void get2()
	{
		System.out.println("DervideClass::"+a);
	}
}



public class Sample {

	public static void main(String[] args)
	{
		
        D1 obj=new D1();
        obj.get1();
        obj.get2();
	}

}
