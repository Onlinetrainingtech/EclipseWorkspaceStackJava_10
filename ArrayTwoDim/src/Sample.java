import java.util.Scanner;

class Foo
{
	int i,j,n,m;
	int empid[][]=new int[2][2];
	Scanner sc=new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter the n value is:: and m is::");
		n=sc.nextInt();
		m=sc.nextInt();
		
	}
	void getInput()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the Array value is::");
				empid[i][j]=sc.nextInt();
			}
		}
	}
	void getDisplay()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Your value is::"+empid[i][j]);
				System.out.println("I value is::"+i+"J value is::"+j);
				
			}
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		
		Foo s=new Foo();
		s.input();
		s.getInput();
		s.getDisplay();

	}

}
