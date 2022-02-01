
public class Sample 
{

	public <M> M test(M t)
	{
		System.out.println("Generic Methods::"+t);
		return t;
	}
	
	
	
	public static void main(String[] args) {
		
		Sample g=new Sample();
		g.test(1000);
		g.test("apple");
		g.test(2.3);

	}

}
