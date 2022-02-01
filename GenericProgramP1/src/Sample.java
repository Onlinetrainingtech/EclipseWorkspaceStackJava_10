
public class Sample<T>
{

	public T t;//int t
	
	public void setValue(T t)
	{
		this.t=t;
	}
	public void get()
	{
		System.out.println("Integervalue is::"+t);
	}
	
	
	public static void main(String[] args) 
	{
		
		Sample<Integer>obj1=new Sample<Integer>();
		
		Sample<String>obj2=new Sample<String>();
		
		obj1.setValue(100);
		
		obj2.setValue("apple");
		
		obj1.get();
		
		obj2.get();

	}

}
