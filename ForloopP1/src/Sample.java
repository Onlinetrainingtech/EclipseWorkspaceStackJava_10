import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even NUmber is:"+i);
			}
			else
			{
				System.out.println("Odd NUmber is:"+i);
			}
			//System.out.println("I value is::"+i);
		}

	}

}
