class B1
{
	int a=100;
	void get1()
	{
		System.out.println("BaseClass");
	}
}
class D1 extends B1
{
	int b=200;
	void get2()
	{
		System.out.println("DervideClass");
	}
}
class D2 extends D1
{
	void display()
	{
		System.out.println("BaseClass and Dervide Class::"+a+b);
	}
}
public class Demo {

	public static void main(String[] args) {
		
		D2 f=new D2();
		f.get1();
		f.get2();
		f.display();

	}

}
