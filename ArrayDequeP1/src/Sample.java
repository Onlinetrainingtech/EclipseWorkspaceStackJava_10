import java.util.ArrayDeque;

public class Sample {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> obj=new ArrayDeque<>();
		obj.addFirst(2001);
		obj.add(1001);
		obj.add(1002);
		obj.add(1003);
		obj.addLast(3001);
		obj.removeFirst();
		System.out.println("Your data is::"+obj);

	}

}
