interface B1
{
	void addProduct();
	
}
interface B2 
{
	void viewProduct();
}
class Demo implements B2,B1
{

	@Override
	public void addProduct() {
		
		System.out.println("This is AddProduct");
		
	}

	@Override
	public void viewProduct() {
		System.out.println("This is ViewProduct");
		
	}
	
}


public class Sample {

	public static void main(String[] args) {
	
		Demo f1=new Demo();
		f1.addProduct();
		f1.viewProduct();

	}

}
