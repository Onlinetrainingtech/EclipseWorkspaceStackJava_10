import java.util.Map;
import java.util.TreeMap;

public class Sample {

	
	TreeMap<Integer,String>g1=new TreeMap<>();
	
	void get1()
	{
		g1.put(101,"Azar");
		g1.put(102,"Mohamed");
		
		for(Map.Entry m:g1.entrySet())
		{
			System.out.println("Your value is::"+m.getValue()+""+m.getKey());
		}
		System.out.println("Your size is::"+g1.size());
		
		System.out.println("Remove the element::"+g1.remove(101));
		
		System.out.println("Searching the elements::"+g1.containsKey(101));
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Sample f1=new Sample();
		f1.get1();

	}

}
