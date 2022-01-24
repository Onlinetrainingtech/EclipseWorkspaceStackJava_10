import java.util.Scanner;

class Demo
{
	int i,n;
	int productid[]=new int[5];
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		
	}
	void logic()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the Array value is::");
			productid[i]=sc.nextInt();
			
		}
		for(i=0;i<=n;i++)
		{
			System.out.println("Your value is::"+productid[i]);
		}
	}
}


public class Sample {

	public static void main(String[] args)
	{
		
        Demo f1=new Demo();
        f1.input();
        f1.logic();
	}

}
