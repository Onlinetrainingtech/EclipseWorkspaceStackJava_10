
public class Sample {

	public static void main(String[] args) 
	{

       StringBuilder sb=new StringBuilder("Welcome");
       System.out.println(sb.insert(3,"*****"));
       System.out.println(sb.delete(3,6));
       System.out.println(sb.append("$$$$"));
       System.out.println(sb.reverse());

	}

}
