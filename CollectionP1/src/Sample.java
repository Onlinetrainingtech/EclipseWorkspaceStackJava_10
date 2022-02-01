import java.util.HashSet;
import java.util.Iterator;

class Demo
{
	HashSet<Integer>list1=new HashSet<>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1004);
		list1.add(1004);
		System.out.println("Your value is::"+list1);
		System.out.println("Your size of list::"+list1.size());
		System.out.println("Remove data is::"+list1.remove(1001));
		System.out.println("Searching data is::"+list1.contains(1001));
		Iterator<Integer>g=list1.iterator();
		while(g.hasNext())
		{
			System.out.println("Your loop data is::"+g.next());
		}
		
	}
}



public class Sample {

	public static void main(String[] args) {


		Demo f1=new Demo();
		f1.get1();

	}

}
