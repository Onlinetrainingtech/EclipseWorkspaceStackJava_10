class Demo
{
	Demo()
	{
		System.out.println("This is Default Cons..");
	}
	Demo(int empid,String empname)
	{
		System.out.println(empid+""+empname);
	}
	void get1()
	{
		System.out.println("This is the normal function.");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();//default cons
		new Demo(100,"azar");
		f1.get1();

	}

}
