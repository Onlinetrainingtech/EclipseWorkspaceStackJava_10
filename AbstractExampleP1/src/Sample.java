abstract class B
{
	abstract void get1();
	void get2()
	{
		System.out.println("This is normal function...");
	}
}
class Foo extends B
{

	@Override
	void get1() {
		
		System.out.println("This is Abstract class def..");
		
	}
	
}

public class Sample {

	public static void main(String[] args) {
		
		
		Foo g1=new Foo();
		g1.get1();
		g1.get2();

		
	}

}
