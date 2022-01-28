
public class ProductDAOImpl implements ProductDAO
{


	@Override
	public void addProduct() {
		
		System.out.println("This is the addProduct");
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		ProductDAOImpl sc=new ProductDAOImpl();
		sc.addProduct();

	}

	

}
