
public class Product 
{
    int productid=1001;//class or instance variable
	void addProduct()
	{
		System.out.println("This is addProduct"+productid);
	}
	void addCategory()
	{
		String cname="mobile";//local variable
		int cid=2001;
		System.out.println("This is addCategory"+cname+""+cid);
	}
	
	
}

class Demo
{
	public static void main(String[] args) 
	{
		
       Product p1=new Product();
       p1.addProduct();
       p1.addCategory();
	}

}
