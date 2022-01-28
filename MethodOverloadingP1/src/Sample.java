class Demo
{
	void addDetails(String pname,int pid)
	{
		System.out.println(pname+""+pid);
	}
	void addDetails(int pprice)
	{
		System.out.println(pprice);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.addDetails("apple",1001);
		f1.addDetails(100);

	}

}
